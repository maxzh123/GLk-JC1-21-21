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
        int indexMaxElement = Task20.indexMaxElement(Task53.array);
        System.out.println(myThread.getName() + " создал массив: "
                + Arrays.toString(Task53.array) +
                " и нашёл его максимальный элемент равный: " + Task53.array[indexMaxElement]);
    }
}