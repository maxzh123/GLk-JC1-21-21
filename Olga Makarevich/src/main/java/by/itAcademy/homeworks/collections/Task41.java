package by.itAcademy.homeworks.collections;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
//Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;

public class Task41 {
    public static void main(String[] args) {
        int a = 10; // количество учеников
        ArrayList<Integer> listOfStudentsAssessment = new ArrayList<Integer>();
        System.out.println(Task39.createArrayListRandom(listOfStudentsAssessment, a));
        System.out.println("Самая высокая оценка = " + foundMax(listOfStudentsAssessment));
    }

    static int foundMax(ArrayList<Integer> random) {
        int max = 0;
        Iterator<Integer> i = random.iterator();
        while (i.hasNext()) {
            Integer curr = i.next();
                if (curr > max) {
                    max = curr;
                }
        }
        return max;
    }
}
