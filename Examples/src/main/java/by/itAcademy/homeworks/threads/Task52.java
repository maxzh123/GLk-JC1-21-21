package by.itAcademy.homeworks.threads;

import java.util.concurrent.TimeUnit;

public class Task52 {
    public static void main(String[] args) throws InterruptedException {
        Thread t= new Thread(new ThreadWork());
        t.setDaemon(true);
        System.out.println("Main 1");
        t.start();
        TimeUnit.MILLISECONDS.sleep(50);
        System.out.println("Main 2");
        //t.join();
        System.out.println("Main 3");
    }
}
