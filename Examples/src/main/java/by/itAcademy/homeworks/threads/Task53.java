package by.itAcademy.homeworks.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Task53 {
    public static void main(String[] args) {
        ExecutorService svc= Executors.newFixedThreadPool(5);
        for(int i=0;i<5000;i++){
            WaitTheadWork t=new WaitTheadWork(50);
            svc.submit(t);
        }
        svc.shutdown();
        svc.submit(new WaitTheadWork(500));
    }
}

