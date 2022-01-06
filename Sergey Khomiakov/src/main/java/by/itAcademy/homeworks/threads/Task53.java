package by.itAcademy.homeworks.threads;

import java.util.ArrayList;
import java.util.List;

/** Задание 53
 * 1) Создать класс поток.
 * 2) Поток должен генерировать массив случайных целых чисел из 10 элементов.
 * 3) Поток должен находить максимальный элемент в этом массиве.
 * 4) Поток должен выводит на экран сообщение в формате имя потока, максимальный элемент.
 * 5) Запустить 10 потоков.
 */

public class Task53 {
    public static void main(String[] args) {
        int numberOfThreads = 10;
        List<MyThreadForTask53> myThreads = new ArrayList<>();

        for(int i = 0; i<numberOfThreads;i++){
            myThreads.add(new MyThreadForTask53());
            myThreads.get(i).start();
        }

    }

}
