package by.itAcademy.homeworks.threads;

/**
 * Задание 53
 * Создать класс поток, который генерирует массив случайных целых чисел из 10 элементов, затем находит
 * максимальный элемент, в этом массиве, и выводит на экран в формате имя потока, максимальный элемент.
 * Запустить 10 потоков.
 */

import java.util.Random;

public class Task53 {
    static int[] array;

    public static void main(String[] args) {
        int amountThreads = 10;
        Thread[] threadsArray = new Thread[amountThreads];
        creatingThreads(threadsArray);
        startingThreads(threadsArray);
    }

    public static void creatingThreads(Thread[] threadsArray) {
        for (int i = 0; i < threadsArray.length; i++) {
            threadsArray[i] = new MyThread53().myThread;
            threadsArray[i].setName("Поток №" + (i + 1));
        }
    }

    public static void startingThreads(Thread[] threadsArray) {
        for (Thread thread : threadsArray) {
            fillingTheArray();
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void fillingTheArray() {
        Random randomNumber = new Random();
        array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber.nextInt(500);
        }
    }
}
