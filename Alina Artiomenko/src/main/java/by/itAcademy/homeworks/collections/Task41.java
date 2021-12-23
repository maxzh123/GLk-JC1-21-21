package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**Задание 41
 * 1. Создать список оценок учеников с помощью ArrayList
 * 2. Заполнить случайными значениями
 * 3. Найти самую высокую оценку с использованием итератора.
 */

public class Task41 {
    public static void main(String[] args){
        int numberOfScore = 5;
        ArrayList<Integer> score = Task39.createAndFillList(numberOfScore);
        System.out.println("Исходный список: " + score);
        System.out.println("Самая большая оценка: " + maxScore(score));
    }

    public static int maxScore(ArrayList<Integer> list){
        Iterator<Integer> iter = list.iterator();
        int max = list.get(0);
        while (iter.hasNext()){
            Integer nextNumber = iter.next();
            if (max <= nextNumber){
                max = nextNumber;
            }
        }
        return max;
    }
}
