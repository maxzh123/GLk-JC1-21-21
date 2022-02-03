package by.itAcademy.homeworks.threads;

public class MyThreadTask55 implements Runnable {
    Thread th;
    MyThreadTask55(){
        th=new Thread(this);
        th.start();
    }
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
