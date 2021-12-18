package by.itAcademy.homeworks.collections;

import java.util.*;

/** Задание 40
 * 1) Создать коллекцию, заполнить ее случайными целыми числами.
 * 2) Удалить повторяющиеся числа.
 */

public class Task40 {
    public static void main(String[] args) {
        List<Integer> array = HelperForCollections.fillTheArrayList(10);
        System.out.println("Первоначальный список: " + array);
        Set<Integer> secondArray = new HashSet<>(array);
        System.out.println("Переработанный список, из которого повторы удалены: " + secondArray);
    }

}
