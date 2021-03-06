package by.itAcademy.homeworks.threads;

/**
 * Задание 52
 * Создать 10 потоков, каждый из которых вычисляет среднее арифметическое
 * коллекции из 10 случайных целых чисел и выводит на экран.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task52 {
    public static void main(String[] args) {
        int amountThreads = 10;
        Thread[] threadsArray = new Thread[amountThreads];
        creatingThreads(threadsArray);
        startingThreads(threadsArray);
    }

    public static void creatingThreads(Thread[] threadsArray) {
        for (int i = 0; i < threadsArray.length; i++) {
            threadsArray[i] = new MyThread52(creationAndFillingList(10));
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

    public static List<Integer> creationAndFillingList(int amountOfNumbers) {
        List<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < amountOfNumbers; i++) {
            arrayList.add(random.nextInt(100));
        }
        return arrayList;
    }
}