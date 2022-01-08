package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**Создать список оценок учеников с помощью ArrayList,
 *  заполнить случайными оценками. Найти самую высокую
 *  оценку с использованием итератора.**/
public class Task41 {
    public static void main(String[] args) {
        int element = 10;
        ArrayList<Integer> list = Task39.makeList(element);
        System.out.println("Первоначальный список: " + list);
        System.out.println("Самая высокая оценка: " + maxGrade(list));
    }
    public static int maxGrade(ArrayList<Integer>list) {
        int max = list.get(0);
        for (Iterator<Integer> y = list.iterator(); y.hasNext(); ) {
            int num=y.next();
            if (max <= num) {
                max = num;
            }
        }
        return max;
    }
}
