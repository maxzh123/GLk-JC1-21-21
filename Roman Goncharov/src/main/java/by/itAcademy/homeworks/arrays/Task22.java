package by.itAcademy.homeworks.arrays;

// Задание 22
// Создать массив из 10 элементов, заполнить его произвольными целочисленными значениями,
// вывести на экран массив и его перевернутую копию.

import java.util.Arrays;

public class Task22 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Task18.fillingTheArray(array);
        reverseTheArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void reverseTheArray (int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int a = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = a;
        }
    }
}
