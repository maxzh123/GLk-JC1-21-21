package by.itAcademy.homeworks.arrays;

// Задание 21
// Создать массив из 10 элементов, заполнить его произвольными целочисленными значениями,
// определить сумму элементов между максимальным и минимальным элементами массива.

import java.util.Arrays;

public class Task21 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Task18.fillingTheArray(array);
        System.out.println("Сумма элементов между максимальным и минимальным элементами массива равна: " +calcSum(array));
    }

    public static int calcSum(int[] array){
        int indexMax = Task20.indexMaxElement(array);
        System.out.println("Максимальный элемент массива: " + array[indexMax]);
        System.out.println("Индекс максимального элемента: " + indexMax);
        int indexMin = indexMinElement(array);
        System.out.println("Минимальный элемент массива: " + array[indexMin]);
        System.out.println("Индекс минимального элемента: " + indexMin);
        return sumElementsOfArray(array, indexMax, indexMin);
    }

    public static int indexMinElement(int[] array) {
        int indexMin = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        return indexMin;
    }
    public static int sumElementsOfArray (int[] array, int indexMax, int indexMin) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > indexMax && i < indexMin) {
                sum = sum + array[i];
            } else if (i > indexMin && i < indexMax) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}
