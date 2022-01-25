package by.itAcademy.homeworks.collections;

import java.util.Iterator;
import java.util.List;

/**
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Удалить неудовлетворительные оценки из списка.
 */

public class Task39 {
    public static void main(String[] args) {
        List<Integer> listOfStudents = FillingTheList.fill(10);
        System.out.println(listOfStudents);
        System.out.println(deletingRatings(listOfStudents));
    }
     //Не пойму почему правильно удалять элементы коллекций именно через итератор
    public static List<Integer> deletingRatings(List<Integer> listOfStudents){
        Iterator<Integer> iterator = listOfStudents.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            if(i<3)
                iterator.remove();
        }
        return listOfStudents;
    }
}
