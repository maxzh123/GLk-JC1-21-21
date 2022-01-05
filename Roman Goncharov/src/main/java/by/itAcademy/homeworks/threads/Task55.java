package by.itAcademy.homeworks.threads;

/**
 * Задание 55
 * Создать метод, который печатает название потока и засыпает на 2 секунды. Запустить одновременно 10 потоков.
 * Реализовать механизм синхронизации, чтобы все потоки выполнились последовательно.
 */

public class Task55 {
    public static void main(String[] args) {
        int amountThreads = 10;
        Thread[] threadsArray = new Thread[amountThreads];
        creatingThreads(threadsArray);
        startingThreads(threadsArray);
    }

    public static void creatingThreads(Thread[] threadsArray) {
        for (int i = 0; i < threadsArray.length; i++) {
            threadsArray[i] = new MyThread55();
            threadsArray[i].setName("Поток № " + (i + 1));
        }
    }

    public static void startingThreads(Thread[] threadsArray) {
        for (Thread thread : threadsArray) {
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
