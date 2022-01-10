package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.threads.task56.MyFirstThreadForTask56;
import by.itAcademy.homeworks.threads.task56.MySecondThreadForTask56;
import by.itAcademy.homeworks.threads.task56.MyThirdThreadForTask56;

/** Задание 56
 * 1) Создать три потока.
 * 2) Создать  deadlock между тремя потоками.
 */

public class Task56 {

    public static void main(String[] args) {
        MyFirstThreadForTask56 thread1 = new MyFirstThreadForTask56();
        MySecondThreadForTask56 thread2 = new MySecondThreadForTask56();
        MyThirdThreadForTask56 thread3 = new MyThirdThreadForTask56();

    }
}
