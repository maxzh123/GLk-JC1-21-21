package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.io.Task49;
import java.util.ArrayList;


public class MyThreadTask52 extends Thread {
    final private ArrayList<Integer> list;
    MyThreadTask52(ArrayList<Integer> list){
        this.list=list;
    }
    @Override
    public void run() {
        System.out.println("поток: " + Thread.currentThread().getName() + " среднее арифметическое: " + Task49.everageNumber(list));
    }
}

