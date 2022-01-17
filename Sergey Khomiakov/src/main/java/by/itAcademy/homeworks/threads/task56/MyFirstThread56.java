package by.itAcademy.homeworks.threads.task56;

public class MyFirstThread56 {

    public static final Object Lock1 = new Object();

    public MyFirstThread56() {
        new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Поток " + Thread.currentThread().getName() + " вошел в Lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Поток " + Thread.currentThread().getName() + " пытается получить доступ к Lock 2");
                synchronized (MySecondThread56.Lock2) {
                    System.out.println("Поток " + Thread.currentThread().getName() + " вошел в Lock2");
                }
            }
        }).start();
    }
}


