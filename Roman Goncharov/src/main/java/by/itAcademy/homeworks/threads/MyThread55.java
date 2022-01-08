package by.itAcademy.homeworks.threads;

public class MyThread55 implements Runnable {
    @Override
    public void run() {
        threadNameOutput();
    }

    public synchronized void threadNameOutput() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
