package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.arrays.Task20;

import java.util.Arrays;

public class MyThread53 implements Runnable {
    Thread myThread;

    public MyThread53() {
        myThread = new Thread(this);
    }

    @Override
    public void run() {
        int[] arrayForThread = Task53.creationAndFillingTheArray(10);
        int indexMaxElement = Task20.indexMaxElement(arrayForThread);
        System.out.println(myThread.getName() + " создал массив: "
                + Arrays.toString(arrayForThread) +
                " и нашёл его максимальный элемент равный: " + arrayForThread[indexMaxElement]);
    }
}