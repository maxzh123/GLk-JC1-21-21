package by.itAcademy.homeworks.threads;

public class Task55 {

    public static void main(String[] args) {

        int numberOfTreads = 10;
        Thread[] tread = new Thread[numberOfTreads];

        for (int i = 0; i < tread.length; i++) {
            tread[i] = new Thread(new MyThread55());
            tread[i].start();
        }


        } public static synchronized void currentThread(){
        System.out.println("Тред - " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
