package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**Создайте переменную для массива из 10 элементов.
 * Заполните его произвольными значениями целочисленного типа.
 * Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
 * Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение разницы индексов между максимальным и минимальным значениями.
 */

//Если я правильно понял условие, то если макс и мин значение одно, то должна быть сумма элементом между ними.
// А если мин или макс несколько, то должна быть сумма элементов между максимально удаленными друг от друга макс и мин.

public class Task21 {
    public static void main(String[] args) {

        int n = 10;
        int[] array = {46, 5, 3, 1, 60, 195, 11, 200, 127, 1};

        int maxIndex = MyArraysHelper.theMaxValueIndex(array);
        int minIndex = MyArraysHelper.theMinValueIndex(array);

        System.out.println(Arrays.toString(array));

        System.out.println("Максимальный идекс максимального значения =" + getTheMaxIndexOfTheSameValue(array, maxIndex));
        System.out.println("Минимальнй индекс минимального значения = " + getTheMinIndexOfTheSameValue(array, minIndex));
        System.out.println("Сумма между Мин и Макс = " + MyArraysHelper.getTheSumBetweenMaxAndMin(array, getTheMinIndexOfTheSameValue(array, minIndex), getTheMaxIndexOfTheSameValue(array, maxIndex)));

    }

    public static int getTheMaxIndexOfTheSameValue(int[] array, int max) {

        for (int i = 0; i < array.length; i++) {
            if (array[max] == array[i] && max < i) {
                max = i;
            }
        }
        return max;
    }

    public static int getTheMinIndexOfTheSameValue(int[] array, int min) {
        for (int i = 0; i < array.length; i++) {
            if (array[min] == array[i] && min > i) {
                min = i;
            }
        }
        return min;
    }
}
