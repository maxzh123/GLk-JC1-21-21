package by.itAcademy.homeworks.arrays;

// Задание 18
// Создать массив из 10 элементов, заполнить его произвольными целочисленными значениями и
// вывести последний элемент массива на экран.

import java.util.Arrays;
import java.util.Random;

public class Task18 {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillingTheArray(array);
        System.out.println(array[array.length - 1]);
    }

    public static void fillingTheArray(int[] a) {
        int[] newArray = a;
        Random randomNumber = new Random();
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = randomNumber.nextInt(500);
        }
        System.out.println(Arrays.toString(newArray));
    }
}
