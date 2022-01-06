package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/** Задание 53
 * 1) Создать класс поток.
 * 2) Поток должен генерировать массив случайных целых чисел из 10 элементов.
 * 3) Поток должен находить максимальный элемент в этом массиве.
 * 4) Поток должен выводит на экран сообщение в формате имя потока, максимальный элемент.
 * 5) Запустить 10 потоков.
 */

public class MyThreadForTask53 extends Thread {
    @Override
    public void run() {
        int numberOfIntegers = 10;
        List<Integer> listOfIntegers = new ArrayList<>(numberOfIntegers);
        Random random = new Random();

        for (int i=0; i<numberOfIntegers; i++){
            listOfIntegers.add(random.nextInt(100)+1);
        }

        int maxElement = listOfIntegers.get(0);
        for (Integer element: listOfIntegers){
            if(element>maxElement){
                maxElement=element;
            }
        }

        System.out.println("Максимальное значение для потока " + Thread.currentThread().getName() + " равно " +
              maxElement);
    }
}
