package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**
 * Создайте переменную для массива из 10 элементов.
 * Заполните его произвольными значениями целочисленного типа.
 * Определите сумму элементов массива, расположенных между минимальным и максимальным значениями.
 * Если значений максимальных и минимальных несколько, то необходимо взять максимальное значение разницы индексов между максимальным и минимальным значениями.
 */

//Если я правильно понял условие, то если макс и мин значение одно, то должна быть сумма элементом между ними.
// А если мин или макс несколько, то должна быть сумма элементов между максимально удаленными друг от друга макс и мин.

public class Task21 {
    public static void main(String[] args) {

        int n = 10;
        int[] array = Task18.randomArrays(n);

        System.out.println("Сумма между Мин и Макс = " + calcSum(array));


    }

    public static int calcSum(int[] array) {
        int maxValue = MyArraysHelper.theMaxValueIndex(array);
        int minValue = MyArraysHelper.theMinValueIndex(array);
        int maxIndexMaxV = getTheMaxIndexOfTheSameValue(array, maxValue);
        int minIndexMaxV = getTheMinIndexOfTheSameValue(array, maxValue);
        int maxIndexMinV = getTheMaxIndexOfTheSameValue(array, minValue);
        int minIndexMinV = getTheMinIndexOfTheSameValue(array, minValue);

        System.out.println(Arrays.toString(array));

        System.out.println("Максимальный индекс максимального значения =" + maxIndexMaxV);
        System.out.println("Минимальный индекс максимального значения =" + minIndexMaxV);
        System.out.println("");
        System.out.println("Максимальный индекс минимального значения = " + maxIndexMinV);
        System.out.println("Минимальный индекс минимального значения =" + minIndexMinV);

        if ( getTheCountBetweenMinValueMaxValue(minIndexMinV,maxIndexMaxV) > getTheCountBetweenMaxValueMinValue(minIndexMaxV,maxIndexMinV)) {

            return MyArraysHelper.getTheSumBetween(array,minIndexMinV,maxIndexMaxV) ;
        } else {
            return MyArraysHelper.getTheSumBetween(array,minIndexMaxV,maxIndexMinV);
        }

    }
    public static int getTheCountBetweenMinValueMaxValue(int minIndexMinV, int maxIndexMaxV){
        int count = 0;
        for ( int i = minIndexMinV; i < maxIndexMaxV; i++){
            count ++;
        } return count;
    }
    public static int getTheCountBetweenMaxValueMinValue(int minIndexMaxV, int maxIndexMinV) {
       int count = 0;
        for (int i = minIndexMaxV; i < maxIndexMinV; i++) {
            count ++;
        }
        return count;
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
