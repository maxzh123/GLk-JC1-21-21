package by.itAcademy.homeworks.threads.task56;

public class MyThirdThread56 {
    public static final Object Lock3 = new Object();

    public MyThirdThread56() {
        new Thread(() -> {
            synchronized (Lock3) {
                System.out.println("Поток " + Thread.currentThread().getName() + " вошел в Lock3");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Поток " + Thread.currentThread().getName() + " пытается получить доступ к Lock 1");
                synchronized (MyFirstThread56.Lock1) {
                    System.out.println("Поток " + Thread.currentThread().getName() + " вошел в Lock1");
                }
            }
        }).start();
    }
}


