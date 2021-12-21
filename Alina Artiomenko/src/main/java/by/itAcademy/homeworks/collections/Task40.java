package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**Задание 40
 * 1. Создать коллекцию
 * 2. Заполнить коллекцию случайными числами типа Integer
 * 3. Удалить повторяющиеся числа
 */

public class Task40 {
    public static void main(String[] args){
        int numberOfElements = 10;
        ArrayList<Integer> listOfNumber = Task39.createAndFillList(numberOfElements);
        System.out.println("Исходный список: " + listOfNumber);
        System.out.println("Список без дубликатов: " + removeDuplicateValues(listOfNumber));
    }

    //remove duplicate
    public static ArrayList<Integer> removeDuplicateValues(ArrayList<Integer> list){
        Set<Integer> set = new LinkedHashSet<>(list);
        list = new ArrayList<>(set);
        return list;
    }
}
