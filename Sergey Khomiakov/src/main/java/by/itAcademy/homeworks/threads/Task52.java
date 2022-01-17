package by.itAcademy.homeworks.threads;

/** Задание 52
 * 1) Создать 10 потоков
 * 2) Каждый из потоков должен вычислять среднее арифметическое коллекции из 10 случайных целых чисел и выводить на экран.
 */

public class Task52 {
    public static void main(String[] args) {
        int numberOfThreads = 10;

        MyThreadFor52[] myThreads = new MyThreadFor52[numberOfThreads];
        for (int i = 0; i< myThreads.length; i++){
            myThreads[i] = new MyThreadFor52();
            myThreads[i].start();
        }
    }
}
