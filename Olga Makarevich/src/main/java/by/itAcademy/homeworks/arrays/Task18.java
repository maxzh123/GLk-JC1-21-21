package by.itAcademy.homeworks.arrays;

// Создайте переменную для массива из 10 элементов.
// Заполните его произвольными значениями целочисленного типа и выведите последний элемент массива на экран.

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        int [] array1 = ArraysHelper.arrayRandom(10);
        System.out.println(Arrays.toString(array1));
        System.out.print(array1[9]);
    }

}
