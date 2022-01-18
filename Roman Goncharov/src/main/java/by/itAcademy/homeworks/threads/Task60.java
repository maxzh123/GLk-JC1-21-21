package by.itAcademy.homeworks.threads;

/**
 * Задание 60
 * Создать задачу Callable, которая берет сообщение “Hello World” + текущее время и записывает его в файл.
 * Запись в файл должна производиться последовательно через синхронизированный метод.
 * Запустить 10 задач параллельно в пуле из 3 потоков.
 * Вывести ход программы на экран с указанием имени потока, который выполняет работу.
 */

import by.itAcademy.homeworks.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task60 {
    private static final List<Future<String>> futures = new ArrayList<>();

    public static void main(String[] args) {
        FileHandler myFH = new FileHandler("threads" + File.separator + "TextFile60.txt");
        File myFile = new File(myFH.getFilePath());
        fileCleaning(myFile);
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            MyCallable60 myCall = new MyCallable60(myFile);
            Future<String> future = pool.submit(myCall);
            futures.add(future);
        }
        pool.shutdown();
        try {
            checkWork();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void checkWork() throws InterruptedException, ExecutionException {
        while (futures.size() > 0) {
            Thread.sleep(1000);
            ListIterator<Future<String>> it = futures.listIterator();
            while (it.hasNext()) {
                Future<String> future = it.next();
                if (future.isDone()) {
                    System.out.println(future.get());
                    it.remove();
                }
            }
        }
    }

    public static void fileCleaning(File file) {
        if (file.exists()) {
            file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
