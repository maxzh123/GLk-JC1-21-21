package by.itAcademy.homeworks.threads;

public class Task53 {
    public static void main(String[] args) {

        int numberOfTreads = 1;
        MyThread53[] thread = new MyThread53[numberOfTreads];

        for (int i = 0; i < thread.length; i++) {
            thread[i] = new MyThread53();
            thread[i].start();
        }
    }
}