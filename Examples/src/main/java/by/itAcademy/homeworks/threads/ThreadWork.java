package by.itAcademy.homeworks.threads;

import java.util.concurrent.TimeUnit;

public class ThreadWork implements Runnable {
    @Override
    public void run() {
        System.out.println("Work 1");
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Work 2");

    }
}
