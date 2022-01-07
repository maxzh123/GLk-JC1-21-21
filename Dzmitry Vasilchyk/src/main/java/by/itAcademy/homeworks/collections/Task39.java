package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.Iterator;

/** Создать список оценок учеников с помощью ArrayList,
 * заполнить случайными оценками.
 * Удалить неудовлетворительные оценки из списка.**/

public class Task39 {
    public static void main(String[] args) {
        int element=10;
        int negative=5;
        ArrayList<Integer>changeMark=makeList(element);
        System.out.println("Первоначальный список: "+changeMark);
        System.out.println("Измененный список: "+changeList(changeMark,negative));
    }
    public static ArrayList<Integer> makeList(int x){  //создаю массив
        ArrayList<Integer> mark=new ArrayList<>(x);
        for (int i=0;i<x;i++){
            mark.add((int)(Math.random()*10+1));
        }
        return mark;
    }
    private static ArrayList<Integer> changeList(ArrayList<Integer>mark,int b){
        for(Iterator<Integer>y=mark.iterator(); y.hasNext();)//листаю
            if(y.next()<b) {y.remove();}//проверяю,удаляю
        return mark;
    }
}
