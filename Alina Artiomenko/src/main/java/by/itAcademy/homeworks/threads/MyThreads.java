package by.itAcademy.homeworks.threads;

import java.util.ArrayList;

public class MyThreads extends Thread{
    private ArrayList<Integer> list;
    private int count;
    private int sum;
    private double result;

    MyThreads(ArrayList<Integer> list){
        this.list = list;
    }

    @Override
    public void run(){
        System.out.println(getName() + " - среднее арифметическое " + list + " = " + getResult());
    }

    private double getResult(){
        for (Integer arrayList : list){
            sum += arrayList;
            result = (double) sum / list.size();
        }
        return result;
    }
}
