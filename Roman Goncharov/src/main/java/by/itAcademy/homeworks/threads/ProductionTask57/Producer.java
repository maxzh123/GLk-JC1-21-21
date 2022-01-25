package by.itAcademy.homeworks.threads.ProductionTask57;

import by.itAcademy.homeworks.threads.Task57;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {
    private final Queue<Integer> integerQueue;
    private int maxQueueSize;
    private final Random random = new Random();
    private static boolean sleeping = false;
    private int myProduct;

    public Producer(Queue<Integer> integerQueue, int maxQueueSize) {
        this.integerQueue = integerQueue;
        this.maxQueueSize = maxQueueSize;
    }

    @Override
    public void run() {
        while (Task57.processedElements <= 10000) {
            try {
                while (integerQueue.size() >= 100) {
                    System.out.println("\nСлишком много произведенной продукции. Можно отдохнуть.\n");
                    fallAsleep(); // Запрещаем всем производителям производить продукцию.
                    synchronized (integerQueue) {
                        integerQueue.wait();
                    }
                }
                produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        checkResult();
    }

    public static void wakeUp() {
        sleeping = false;
    }

    public static void fallAsleep() {
        sleeping = true;
    }

    public void produce() {
        while (!sleeping) { // Проверка: нужно ли производить продукцию, или нет
            int x = random.nextInt(99) + 1;
            integerQueue.add(x);
            System.out.println(Thread.currentThread().getName() + " добавил " + x +
                    ", это его " + ++myProduct + " произведенная продукция, общее " +
                    "количество обработанных элементов: " + ++Task57.processedElements);
            synchronized (integerQueue) {
                integerQueue.notifyAll();
            }
            break;
        }
    }

    public void checkResult() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ": итого произведенной продукции " + myProduct);
    }
}