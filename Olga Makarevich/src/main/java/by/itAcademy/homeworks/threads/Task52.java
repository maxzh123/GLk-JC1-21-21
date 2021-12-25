package by.itAcademy.homeworks.threads;

// Создать 10 потоков, каждый из которых вычисляет среднее арифметическое коллекции
// из 10 случайных целых чисел и выводит на экран.

import by.itAcademy.homeworks.collections.Task39;

import java.util.ArrayList;

public class Task52<randomArrayList> {
    static class NewThread extends Thread {
        public void run() {
            ArrayList<Integer> myArrayList = new ArrayList<>();
            ArrayList<Integer> newArrayList = Task39.createArrayListRandom(myArrayList, 10);
            int average = 0;
            int sum = 0;
            for (int i = 0; i < newArrayList.size(); i++) {
                int a = newArrayList.get(i);
                sum = sum + a;
            }
            average = sum / newArrayList.size();
            System.out.println(average);
        }
    }

    public static void main(String[] args) {
        NewThread p1 = new NewThread();
        NewThread p2 = new NewThread();
        NewThread p3 = new NewThread();
        NewThread p4 = new NewThread();
        NewThread p5 = new NewThread();
        NewThread p6 = new NewThread();
        NewThread p7 = new NewThread();
        NewThread p8 = new NewThread();
        NewThread p9 = new NewThread();
        NewThread p10 = new NewThread();
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
