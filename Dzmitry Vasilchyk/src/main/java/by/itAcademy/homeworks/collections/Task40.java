package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**Создать коллекцию, заполнить ее случайными целыми числами.
 *Удалить повторяющиеся числа.**/

public class Task40 {
    public static void main(String[] args) {
        int element=10;
        ArrayList<Integer>list=Task39.makeList(element);
        System.out.println("Первоначальный список: "+list);
        System.out.println("Измененный список: "+delDuplikate(list));
    }

    public static ArrayList<Integer> delDuplikate(ArrayList<Integer>list) {
        list=new ArrayList<>(new HashSet<>(list));
        return list;
    }
}
