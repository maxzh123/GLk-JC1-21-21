package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 * Задание 22
 *
 * Создать переменную для массива из 10 элементов.
 * Заполнить его произвольными значениями целочисленного типа.
 * Вывести на экран.
 * Вывести в обратном порядке.
 */

public class Task22 {
    public static void main(String[] args) {
        int variable = 10;
        int [] array = new int[variable];
        Task18.randomFilling(array);
        invertedArray(array);
        System.out.print(Arrays.toString(array));
    }

    public static void invertedArray (int[] array){
        for (int i  = 0; i < array.length / 2; i++){
            int number = array[i];
            array [i] = array [array.length - 1 - i];
            array[array.length - 1 - i] = number;
        }
    }
}
