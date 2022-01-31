package by.itAcademy.homeworks.threads;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/** Задание 59
 * 1) Создать задачу Callable, которая генерирует коллекцию из 10 рандомных целых
 * чисел -> засыпает произвольно на 1-10 секунд, результат выполнения – сумму этих
 * чисел в виде строки.
 * 2) Запустить 10 задач параллельно в пуле из 3 потоков. Вывести ход программы на
 * экран с указанием имени потока, который выполняет работу.
 */

public class Task59 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> futures= new ArrayList<>();
        Callable<String> callable = new MyCallableFor59();
        for (int i =0; i < 10; i++){
            Future<String> future = executor.submit(callable);
            futures.add(future);
        }
        for(Future<String> element : futures){
            try {
                System.out.println("Забрали из futures:" + element.get() + " : "+ LocalTime.now());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();

    }
}
