package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.threads.task56.MyFirstThread56;
import by.itAcademy.homeworks.threads.task56.MySecondThread56;
import by.itAcademy.homeworks.threads.task56.MyThirdThread56;

/** Задание 56
 * 1) Создать три потока.
 * 2) Создать  deadlock между тремя потоками.
 */

public class Task56 {

    public static void main(String[] args) {
        MyFirstThread56 thread1 = new MyFirstThread56();
        MySecondThread56 thread2 = new MySecondThread56();
        MyThirdThread56 thread3 = new MyThirdThread56();

    }
}
