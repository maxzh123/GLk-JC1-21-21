package by.itAcademy.homeworks.threads.ProductionTask57;

import by.itAcademy.homeworks.threads.Task57;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {
    private final Queue<Integer> integerQueue;
    private int maxQueueSize;
    private final Random random = new Random();
    private static boolean sleeping = false;

    public Producer(Queue<Integer> integerQueue, int maxQueueSize) {
        this.integerQueue = integerQueue;
        this.maxQueueSize = maxQueueSize;
    }

    @Override
    public void run() {
        while (Task57.processedElements <= 10000) {
            try {
                produce();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void wakeUp() {
        sleeping = false;
    }

    public static void fallAsleep() {
        sleeping = true;
    }

    public void produce() throws InterruptedException {
        synchronized (integerQueue) {
            while (integerQueue.size() >= 100) {
                System.out.println("\nСлишком много произведенной продукции. Можно отдохнуть.\n");
                fallAsleep(); // Запрещаем всем производителям производить продукцию.
                integerQueue.wait();
            }
            if (!sleeping) { // Проверка: нужно ли производить продукцию, или нет
                int x = random.nextInt(99) + 1;
                integerQueue.add(x);
                System.out.println(Thread.currentThread().getName() + " добавил " + x +
                        ", количество обработанных элементов: " + ++Task57.processedElements);
                integerQueue.notifyAll();
            }
        }
    }
}