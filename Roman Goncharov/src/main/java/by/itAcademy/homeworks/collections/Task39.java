package by.itAcademy.homeworks.collections;

/**
 * Задание 39
 * Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
 * Удалить неудовлетворительные оценки из списка.
 */

import java.util.ArrayList;
import java.util.List;

public class Task39 {
    public static void main(String[] args) {
        int elements = 10;
        List<Integer> assessments = new ArrayList<>(elements);
        fillingList(assessments,elements);
        System.out.println("Изначальный список оценок: " + assessments);
        System.out.println("Список после удаления неудовлетворительных оценок: " + removingElements(assessments,elements));
    }

    public static void fillingList(List<Integer> arrayList, int amountOfElements) {
        for (int i = 0; i < amountOfElements; i++) {
            arrayList.add((int) (Math.random() * 10 + 1));
        }
    }

    public static List<Integer> removingElements(List<Integer> arrayList, int amountOfElements) {
        for (int i = 0; i < amountOfElements; i++) {
            if (arrayList.get(i) <= 5) {
                arrayList.remove(i); // Удаляем элемент, размер нашего массива уменьшился на 1.
                i--; // Уменьшаем i, чтобы проверить следующий элемент, который стал на место i, иначе мы его пропустим.
                amountOfElements = arrayList.size(); // Наш изначальный размер массива становится равен текущему.
            }
        }
        return arrayList;
    }
}