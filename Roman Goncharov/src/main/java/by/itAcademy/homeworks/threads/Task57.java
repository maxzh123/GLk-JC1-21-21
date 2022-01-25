package by.itAcademy.homeworks.threads;

/**
 * Задание 57
 * Есть 3 производителя и 2 потребителя, все разные потоки и работают все одновременно. Есть очередь с 200 элементами:
 * -Производители добавляют случайное число от 1..100, а потребители берут эти числа.
 * -Если в очереди элементов >= 100 производители спят, если нет элементов в очереди – потребители спят.
 * -Если элементов стало <= 80, производители просыпаются.
 * -Все это работает до тех пор, пока обработанных элементов не станет 10000, только потом программа завершается.
 */

import by.itAcademy.homeworks.threads.ProductionTask57.Consumer;
import by.itAcademy.homeworks.threads.ProductionTask57.Producer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Task57 {
    public static volatile int processedElements;

    public static void main(String[] args) throws InterruptedException {
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        int maxQueueSize = 200; // Добавил макс. размер очереди, хотя именно для этого задания он не нужен.
        creatingAndStartingProducers(queue, maxQueueSize, 3);
        creatingAndStartingConsumers(queue, maxQueueSize, 2);
    }

    public static void creatingAndStartingProducers(Queue<Integer> queue, int maxQueueSize, int numberOfProducers) {
        for (int i = 0; i < numberOfProducers; i++) {
            Thread thread = new Thread(new Producer(queue, maxQueueSize));
            thread.setName("Производитель № " + (i + 1));
            thread.start();
        }
    }

    public static void creatingAndStartingConsumers(Queue<Integer> queue, int maxQueueSize, int numberOfConsumers) {
        for (int i = 0; i < numberOfConsumers; i++) {
            Thread thread = new Thread(new Consumer(queue, maxQueueSize));
            thread.setName("Потребитель № " + (i + 1));
            thread.start();
        }
    }
}