package by.itAcademy.homeworks.collections;

/**
 * Задание 40
 * Создать коллекцию, заполнить ее случайными целыми числами. Удалить повторяющиеся числа.
 */

import java.util.*;

public class Task40 {
    public static void main(String[] args) {
        int elements = 15;
        Collection<Integer> newCollection = new ArrayList<>(elements);
        fillingCollection(newCollection,elements);
        System.out.println("Изначальная коллекция: " + newCollection);
        newCollection = new ArrayList<>(removeRepetitions(newCollection));
        System.out.println("Коллекция после удаления повторяющихся значений: " + newCollection);
    }

    public static void fillingCollection(Collection<Integer> collection, int amountOfElements) {
        for (int i = 0; i < amountOfElements; i++) {
            collection.add((int) (Math.random() * 7 + 1));
        }
    }

    public static Collection<Integer> removeRepetitions(Collection<Integer> collection){
        collection = new LinkedHashSet<>(collection);
        return collection;
    }
}
