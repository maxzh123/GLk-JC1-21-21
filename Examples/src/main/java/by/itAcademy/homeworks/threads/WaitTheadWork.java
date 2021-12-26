package by.itAcademy.homeworks.threads;

import java.util.concurrent.TimeUnit;

public class WaitTheadWork implements Runnable{
    private static volatile long count;

    private final long waitTimeout;
    private final long number=count++;

    public WaitTheadWork(long waitTimeout) {
        this.waitTimeout = waitTimeout;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start task"+number);
        try {
            TimeUnit.MILLISECONDS.sleep(waitTimeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" End task"+number);

    }
}
