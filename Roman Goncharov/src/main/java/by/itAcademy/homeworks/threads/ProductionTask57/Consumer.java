package by.itAcademy.homeworks.threads.ProductionTask57;

import by.itAcademy.homeworks.threads.Task57;

import java.util.Queue;

public class Consumer implements Runnable {
    private final Queue<Integer> integerQueue;
    private int maxQueueSize;
    private int myConsume;

    public Consumer(Queue<Integer> integerQueue, int maxQueueSize) {
        this.integerQueue = integerQueue;
        this.maxQueueSize = maxQueueSize;
    }

    @Override
    public void run() {
        while (Task57.processedElements <= 10000) {
            try {
                while (integerQueue.size() == 0) {
                    System.out.println("\nПродукция закончилась. Ждём пока добавят.\n");
                    synchronized (integerQueue) {
                        integerQueue.wait();
                    }
                }
                consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        checkResult();
    }

    public void consume() {
        synchronized (integerQueue) {
            System.out.println(Thread.currentThread().getName() + " взял " + integerQueue.poll() +
                    ", это его " + ++myConsume + " купленная продукция, общее " +
                    "количество обработанных элементов: " + ++Task57.processedElements);
            while (integerQueue.size() <= 80) {
                Producer.wakeUp(); // Производители могут снова производить продукцию
                integerQueue.notifyAll();
                break;
            }
        }
    }

    public void checkResult() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + ": итого купленной продукции " + myConsume);
    }
}