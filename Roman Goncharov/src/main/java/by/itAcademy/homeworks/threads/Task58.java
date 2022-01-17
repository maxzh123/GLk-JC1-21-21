package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.threads.CallableTask58.MyCallable58;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task58 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        List<Future<String>> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            MyCallable58 myCall = new MyCallable58();
            Future<String> future = pool.submit(myCall);

            list.add(future);
        }
        pool.shutdown();

        while (true){
            boolean bool = pool.isTerminated();
            Thread.sleep(1000);
            if (bool == true){
                for(Future<String> future:list){
                    System.out.println(future.get());
                }
                break;
            }
        }
    }
}
