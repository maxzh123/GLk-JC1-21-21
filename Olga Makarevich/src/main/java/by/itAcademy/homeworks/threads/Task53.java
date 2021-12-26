package by.itAcademy.homeworks.threads;

// Создать класс поток, который генерирует массив случайных целых чисел из 10 элементов,
// затем находит максимальный элемент, в этом массиве, и выводит на экран в формате имя потока, максимальный элемент.
// Запустить 10 потоков.

import by.itAcademy.homeworks.arrays.ArraysHelper;
import by.itAcademy.homeworks.arrays.Task20;

public class Task53 {
    public static class MyThread extends Thread{
        Thread th;
        public MyThread() {
            th = new Thread(this);
        }

        public void run() {
            int[] a = ArraysHelper.arrayRandom(10);
            int max = Task20.getMaxValue(a);
            System.out.println("Имя потока: " + th.getName() + ", max: " + max);
        }
    }

    public static void main(String[] args) {
        Thread p1 = new Thread(new MyThread());
        Thread p2 = new Thread(new MyThread());
        Thread p3 = new Thread(new MyThread());
        Thread p4 = new Thread(new MyThread());
        Thread p5 = new Thread(new MyThread());
        Thread p6 = new Thread(new MyThread());
        Thread p7 = new Thread(new MyThread());
        Thread p8 = new Thread(new MyThread());
        Thread p9 = new Thread(new MyThread());
        Thread p10 = new Thread(new MyThread());
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();
        p9.start();
        p10.start();
    }
}
