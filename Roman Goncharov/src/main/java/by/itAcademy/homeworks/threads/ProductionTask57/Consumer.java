package by.itAcademy.homeworks.threads.ProductionTask57;

import by.itAcademy.homeworks.threads.Task57;

import java.util.Queue;

public class Consumer implements Runnable {
    private final Queue<Integer> integerQueue;
    private int maxQueueSize;

    public Consumer(Queue<Integer> integerQueue, int maxQueueSize) {
        this.integerQueue = integerQueue;
        this.maxQueueSize = maxQueueSize;
    }

    @Override
    public void run() {
        while (Task57.processedElements <= 10000) {
            try {
                consume();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void consume() throws InterruptedException {
        synchronized (integerQueue) {
            while (integerQueue.size() == 0) {
                System.out.println("\nПродукция закончилась. Ждём пока добавят.\n");
                integerQueue.wait();
            }
            System.out.println(Thread.currentThread().getName() + " взял " + integerQueue.poll() +
                    ", количество обработанных элементов: " + ++Task57.processedElements);
            if (integerQueue.size() <= 80) {
                Producer.wakeUp(); // Производители могут снова производить продукцию
                integerQueue.notifyAll();
            }
        }
    }
}