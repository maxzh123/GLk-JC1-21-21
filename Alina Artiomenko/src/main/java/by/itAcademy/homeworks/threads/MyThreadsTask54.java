package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.arrays.Task20;
import by.itAcademy.homeworks.io.WorkWithFileNew;

import java.io.File;
import java.util.Arrays;

public class MyThreadsTask54 implements Runnable{
    private final int amountOfNumbers = 10;
    @Override
    public void run() {
        int[] arrayOfNumber = Task20.fillArrayWithNumber(amountOfNumbers);
        WorkWithFileNew newFile = new WorkWithFileNew(Thread.currentThread().getName()+".txt");
        newFile.createNewFileThreads();
        System.out.println("Массив " + Arrays.toString(arrayOfNumber) + " записывается в файл " + Thread.currentThread().getName());
        newFile.writeToFileThreads(arrayOfNumber);
    }
}
