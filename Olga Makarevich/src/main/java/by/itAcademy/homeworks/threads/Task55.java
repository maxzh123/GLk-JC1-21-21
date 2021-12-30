package by.itAcademy.homeworks.threads;

// Создать метод, который печатает название потока и засыпает на 2 секунды.
// Запустить одновременно 10 потоков.
// Реализовать механизм синхронизации, чтобы все потоки выполнились последовательно.

public class Task55 {
    public static class NewThread implements Runnable {
        @Override
        synchronized public void run () {
            Thread newThread = new Thread(new NewThread());
            newThread.getName();
            try {
                newThread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread p1 = new Thread(new NewThread());
        Thread p2 = new Thread(new NewThread());
        Thread p3 = new Thread(new NewThread());
        Thread p4 = new Thread(new NewThread());
        Thread p5 = new Thread(new NewThread());
        Thread p6 = new Thread(new NewThread());
        Thread p7 = new Thread(new NewThread());
        Thread p8 = new Thread(new NewThread());
        Thread p9 = new Thread(new NewThread());
        Thread p10 = new Thread(new NewThread());
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        p9.start();
        p10.start();
    }
}
