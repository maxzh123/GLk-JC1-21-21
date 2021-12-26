package by.itAcademy.homeworks.threads;

import java.util.ArrayList;

/**Задание 52
 * 1. Создать коллекцию из 10 случайных целых чисел
 * 2. Создать 10 потоков, каждый из которых считает среднее арифметическое коллекции
 * 3. Вывести на экран
 */

public class Task52 {
    public static void main(String[] args) {
        final int value = 10;

        for (int i = 0; i < value; i++){
            ArrayList<Integer> array = createAndFillList(value);
            MyThreads threads = new MyThreads(array);
            threads.start();
        }
    }

    public static ArrayList<Integer> createAndFillList(int number){
        ArrayList<Integer> list = new ArrayList<Integer>(number);
        for (int i = 0; i < number; i++){
            list.add((int)(Math.random() * 10 + 13));
        }
        return list;
    }
}
