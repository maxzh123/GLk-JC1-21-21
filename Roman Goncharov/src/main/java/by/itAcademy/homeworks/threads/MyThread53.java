package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.arrays.Task20;

import java.util.Arrays;

public class MyThread53 implements Runnable {
    private final int[] arrayForThread;

    public MyThread53(int[] arrayForThread) {
        this.arrayForThread = arrayForThread;
    }

    @Override
    public void run() {
        int indexMaxElement = Task20.indexMaxElement(arrayForThread);
        System.out.println(Thread.currentThread().getName() + " создал массив: "
                + Arrays.toString(arrayForThread) +
                " и нашёл его максимальный элемент равный: " + arrayForThread[indexMaxElement]);
    }
}