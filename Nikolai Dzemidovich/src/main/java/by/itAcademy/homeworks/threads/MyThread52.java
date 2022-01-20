package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MyThread52 extends Thread {
    private final int size = 10;
    private List<Integer> listOfNumber;
    private Random random = new Random();

    public MyThread52() {
        this.listOfNumber = new ArrayList<>();
    }

    @Override
    public void run() {
        double count = 0;

        for (int i = 0; i < size; i++) {
            listOfNumber.add(random.nextInt(10));
        }

        for (Integer integer : listOfNumber) {
            count += integer;
        }
        System.out.println("Среднее орифметическое потока" + Thread.currentThread().getName() + " = " + count / (double) size);

    }

}
