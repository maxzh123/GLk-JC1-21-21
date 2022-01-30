package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.collections.Task41;
import by.itAcademy.homeworks.io.Task49;

import java.util.ArrayList;

public class MyThreadTask53 extends Thread {
    final private ArrayList<Integer> list;
    MyThreadTask53(ArrayList<Integer> list){
        this.list=list;
    }
    @Override
    public void run() {
        System.out.println("поток: " + Thread.currentThread().getName() + " максимальный элемнт: " + Task41.maxGrade(list));
    }

}
