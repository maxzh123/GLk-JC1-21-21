package by.itAcademy.homeworks.arrays;

import java.util.Arrays;
//Создайте переменную для массива из 10 элементов. Заполните его произвольными значениями целочисленного типа. Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
// Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение разницы индексов между максимальным и минимальным значениями.

public class Task21 {
    public static void main(String[] args) {

    }

    private static int[] arrayRandom(int[] a) {
        a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (Math.random() * 1000 + 1);
            System.out.println(a);
        }
        return a;
    }

//    private static void arraySort(int[] arrayRandom) {
//        Arrays.sort(arrayRandom);
//        for (int i = 0; i < arrayRandom.length; i++) {
//            System.out.print(arrayRandom[i] + "  ");
//        }
//    }
}

