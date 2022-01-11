package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.arrays.Task20;

import java.util.Arrays;

public class MyThreadsTask53 implements Runnable{
    private final int amountOfumber = 10;

    Thread thread;
    MyThreadsTask53(){
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        int[] array = Task20.fillArrayWithNumber(amountOfumber);
        int maxNumber = getMaxNumberInArray(array);

        System.out.println(Thread.currentThread().getName() + " " + Arrays.toString(array) + " MAX = " + maxNumber);
    }

    int getMaxNumberInArray(int[] array){
        int[] arrayOfNumber = array;
        int max = arrayOfNumber[0];
        for(int i = 0; i < arrayOfNumber.length; i++){
            if (max < arrayOfNumber[i]){
                max = arrayOfNumber[i];
            }
        }
        return max;
    }
}
