package by.itAcademy.homeworks.threads;

import java.util.Arrays;
import java.util.Random;

public class MyThread53 extends Thread {
    private final int value = 10;
    private int[] array;
    private Random random = new Random();

    public MyThread53() {
        this.array = new int[value];
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(99);
        }
        int temp = array[0];
        for (int number : array) {
            if (number > temp) {
                temp = number;
            }
        }

        System.out.println("Максимальное число в массиве потока " + Thread.currentThread().getName() + " =" + temp);

    }
}