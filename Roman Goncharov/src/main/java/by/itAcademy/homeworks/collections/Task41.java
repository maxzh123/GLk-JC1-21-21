package by.itAcademy.homeworks.collections;

/**
 * Задание 41
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Найти самую высокую оценку с использованием итератора.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Task41 {
    public static void main(String[] args) {
        int elements = 10;
        List<Integer> assessments = new ArrayList<>(elements);
        Task39.fillingList(assessments,elements);
        System.out.println("Список оценок: " + assessments);
        System.out.println("Самая высокая оценка: " + maxAssessment(assessments));
    }

    public static Integer maxAssessment (List<Integer> arrayList){
        ListIterator<Integer> it = arrayList.listIterator();
        Integer max = arrayList.get(0);
        while (it.hasNext()){
            Integer next = it.next();
            if (next.compareTo(max) == 1){
                max = next;
            }
        }
        return max;
    }
}
