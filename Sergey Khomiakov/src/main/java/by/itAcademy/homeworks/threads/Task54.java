package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.List;

/** Задание 54
 * 1) Создать класс поток, который создает средствами
 * 2) Поток должен создавать средствами Java файл и записать в него произвольно сгенерированный массив из 10 случайных
 * целых чисел.
 * 3) Запустить 5 потоков.
 */

public class Task54 {
    public static void main(String[] args) {
        int numberOfThreads = 5;
        List<MyThreadForTask54> myThreads = new ArrayList<>();

        for (int i = 0; i < numberOfThreads; i++) {
            String nameOfFile = String.format("ThreadWithNumbers[%d].dat", i+1);
            myThreads.add(new MyThreadForTask54(nameOfFile));
            myThreads.get(i).start();
        }
    }
}

