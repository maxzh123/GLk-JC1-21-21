package by.itAcademy.homeworks.threads;

/**
 * Задание 54
 * Создать класс поток, который создает средствами Java файл и записать в него произвольно
 * сгенерированный массив из 10 случайных целых чисел. Запустить 5 потоков.
 */

import by.itAcademy.homeworks.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Task54 {
    static File file;

    public static void main(String[] args) {
        int amountThreads = 5;
        Thread[] threadsArray = new Thread[amountThreads];
        fileCreationAndCleaning();
        creatingThreads(threadsArray);
        Task53.startingThreads(threadsArray);
    }

    public static void creatingThreads(Thread[] threadsArray) {
        for (int i = 0; i < threadsArray.length; i++) {
            threadsArray[i] = new MyThread54().myThread;
            threadsArray[i].setName("Поток №" + (i + 1));
        }
    }

    public static void fileCreationAndCleaning() {
        file = new File(FileHandler.getDirectoryPath54() + "TextFile54.txt");
        file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
