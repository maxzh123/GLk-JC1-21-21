package by.itAcademy.homeworks.threads;

public class MyThread55 extends Thread {

    @Override
    public void run() {
        threadNameOutput();
    }

    public synchronized void threadNameOutput() {
        System.out.println(getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
