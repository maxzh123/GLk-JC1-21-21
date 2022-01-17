package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/** Задание 52
 * 1) Создать 10 потоков
 * 2) Каждый из потоков должен вычислять среднее арифметическое коллекции из 10 случайных целых чисел и выводить на экран.
 */

public class MyThreadFor52 extends Thread{
    @Override
    public void run() {
       int numberOfIntegers = 10;
       List<Integer> listOfRandomIntegers = new ArrayList<>();
       Random random = new Random();

       for (int i=0; i<numberOfIntegers;i++){
           listOfRandomIntegers.add(random.nextInt(100)+1);
       }

       int sum = 0;
       for(Integer element:listOfRandomIntegers){
           sum+=element;
       }

        System.out.println("Среднее арифметическое коллекции для потока " + Thread.currentThread().getName() + " равно " +
                (double) sum/listOfRandomIntegers.size());
    }
}
