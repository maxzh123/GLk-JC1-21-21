package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.collections.Task39;


import java.util.ArrayList;

/**Создать класс поток, который генерирует массив случайных целых чисел из 10 элементов,
 * затем находит максимальный элемент, в этом массиве, и выводит на экран в формате имя потока,
 * максимальный элемент. Запустить 10 потоков.**/

public class Task53 {
    public static void main(String[] args) {
        final int numberThreads=10;
        for (int i = 0; i < numberThreads; i++) {
            ArrayList<Integer> massiv = Task39.makeList(numberThreads);
            MyThreadTask53 mt = new MyThreadTask53(massiv);
            mt.start();
        }
    }
}

