package by.itAcademy.homeworks.collections;

import java.util.ArrayList;
import java.util.List;

/** Задание 39
 * 1) Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * 2) Удалить неудовлетворительные оценки из списка.
 */


public class Task39 {
    public static void main(String[] args) {
        List<Integer> array = HelperForCollections.fillTheArrayList(10);
        System.out.println("Первоначальный список: " + array);
        System.out.println("Переработанный список, в котором оценки 5 и выше: " + deleteBadMarks(array));
    }

    public static List<Integer> deleteBadMarks(List<Integer> array){
        array.removeIf(element -> element < 5);
        return array;
    }
}
