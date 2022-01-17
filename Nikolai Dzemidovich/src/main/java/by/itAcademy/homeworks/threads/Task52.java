package by.itAcademy.homeworks.threads;

public class Task52 {
    public static void main(String[] args) {
        int numberOfTreads = 10;
        MyTread52[] tread = new MyTread52[numberOfTreads];

        for (int i = 0; i < tread.length; i++) {
            tread[i] = new MyTread52();
            tread[i].start();
        }

    }
}
