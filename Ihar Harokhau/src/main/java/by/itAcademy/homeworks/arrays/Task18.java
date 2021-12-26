package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 * Задание 18
 *
 * Создать переменную для массива из 10 элементов.
 * Заполнить его произвольными значениями целочисленного типа.
 * Вывести последний элемент массива на экран.
 *
 */

public class Task18 {
    public static void main(String[] args) {
        int variable = 10;
        int[] array = new int[variable];
        randomFilling(array);
        System.out.println(array[array.length - 1]);
    }

    public static void randomFilling (int[] newArray){
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(newArray));
    }
}