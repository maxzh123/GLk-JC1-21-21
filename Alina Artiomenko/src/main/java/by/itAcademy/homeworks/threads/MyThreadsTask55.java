package by.itAcademy.homeworks.threads;

public class MyThreadsTask55 implements Runnable{
    Thread thread;

    MyThreadsTask55(){
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
