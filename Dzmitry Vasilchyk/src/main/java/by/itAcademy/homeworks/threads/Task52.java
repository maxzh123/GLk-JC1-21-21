package by.itAcademy.homeworks.threads;


import by.itAcademy.homeworks.collections.Task39;
import java.util.ArrayList;
/**Создать 10 потоков, каждый из которых вычисляет среднее арифметическое коллекции
 * из 10 случайных целых чисел и выводит на экран.**/

public class Task52 {
    public static void main(String[] args) {
        final int numberThreads = 10;
        for (int i = 0; i < numberThreads; i++) {
            ArrayList<Integer> massiv = Task39.makeList(numberThreads);
            MyThreadTask52 mt = new MyThreadTask52(massiv);
            mt.start();
        }
    }
}







