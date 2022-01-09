package by.itAcademy.homeworks.threads;

public class MyThreadForTask55 implements Runnable{
    @Override
    public synchronized void run() {
        System.out.println("Current thread is ..." + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
            System.out.println("Current thread is ..." + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
