package by.itAcademy.homeworks.threads;

public class Task52 {
    public static void main(String[] args) {
        int numberOfTreads = 10;
        MyThread52[] tread = new MyThread52[numberOfTreads];

        for (int i = 0; i < tread.length; i++) {
            tread[i] = new MyThread52();
            tread[i].start();
        }

    }
}
