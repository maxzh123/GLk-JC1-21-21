package by.itAcademy.homeworks.threads.task56;

public class MySecondThreadForTask56 {
    public static final Object Lock2 = new Object();

    public MySecondThreadForTask56() {
        new Thread(() -> {
            synchronized (Lock2) {
                System.out.println("Поток " + Thread.currentThread().getName() + " вошел в Lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Поток " + Thread.currentThread().getName() + " пытается получить доступ к Lock 3");
                synchronized (MyThirdThreadForTask56.Lock3) {
                    System.out.println("Поток " + Thread.currentThread().getName() + " вошел в Lock3");
                }
            }
        }).start();
    }
}
