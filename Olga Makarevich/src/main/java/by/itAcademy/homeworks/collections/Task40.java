package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.HashSet;

// Создать коллекцию, заполнить ее случайными целыми числами.
// Удалить повторяющиеся числа.


public class Task40 {
    public static void main(String[] args) {
        ArrayList<Integer> newArrayList = new ArrayList<>();
        System.out.println(Task39.createArrayListRandom(newArrayList, 10));
        System.out.println(excludeRepetition(newArrayList));
    }

    static ArrayList<Integer> excludeRepetition(ArrayList<Integer> aL) {
        HashSet newHashSet = new HashSet(aL);
        ArrayList aLl = new ArrayList(newHashSet);
        return aLl;
    }
}
