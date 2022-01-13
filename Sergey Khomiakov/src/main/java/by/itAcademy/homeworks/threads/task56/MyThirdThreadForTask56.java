package by.itAcademy.homeworks.threads.task56;

public class MyThirdThreadForTask56 {
    public static final Object Lock3 = new Object();

    public MyThirdThreadForTask56() {
        new Thread(() -> {
            synchronized (Lock3) {
                System.out.println("Поток " + Thread.currentThread().getName() + " вошел в Lock3");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Поток " + Thread.currentThread().getName() + " пытается получить доступ к Lock 1");
                synchronized (MyFirstThreadForTask56.Lock1) {
                    System.out.println("Поток " + Thread.currentThread().getName() + " вошел в Lock1");
                }
            }
        }).start();
    }
}


