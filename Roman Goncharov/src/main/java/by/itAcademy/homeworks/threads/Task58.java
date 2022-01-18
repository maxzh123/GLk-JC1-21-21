package by.itAcademy.homeworks.threads;

/**
 * Задание 58
 * Создать задачу Callable, которая генерирует файл с произвольной строкой -> засыпает произвольно
 * на 1-3 секунды, результат выполнения – коллекция имен файлов. Запустить 10 задач параллельно в пуле из 3 потоков.
 * Вывести ход программы на экран с указанием имени потока, который выполняет работу.
 */

import by.itAcademy.homeworks.threads.CallableTask58.MyCallable58;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task58 {
    private static final List<Future<String>> futures = new ArrayList<>();

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            MyCallable58 myCall = new MyCallable58();
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
                    System.out.println("Результат выполнения задачи: " + future.get());
                    it.remove();
                }
            }
        }
    }
}