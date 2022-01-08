package by.itAcademy.homeworks.threads;

/**
 * Задание 54
 * Создать класс поток, который создает средствами Java файл и записать в него произвольно
 * сгенерированный массив из 10 случайных целых чисел. Запустить 5 потоков.
 */

public class Task54 {
    public static void main(String[] args) {
        int amountThreads = 5;
        Thread[] threadsArray = new Thread[amountThreads];
        creatingThreads(threadsArray);
        startingThreads(threadsArray);
    }

    public static void creatingThreads(Thread[] threadsArray) {
        for (int i = 0; i < threadsArray.length; i++) {
            MyThread54.goToNextFile();
            threadsArray[i] = new Thread(new MyThread54(Task53.creationAndFillingTheArray(10)));
            threadsArray[i].setName("Поток №" + (i + 1));
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

