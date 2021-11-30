package by.itAcademy.homeworks.arrays;

public class MyArraysHelper {

    public static int getTheSumBetweenMaxAndMin(int[] array, int min, int max) {
        int sum = 0;
        for (int i = min + 1; i < max; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int theMinValueIndex(int[] array) {

        int max = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int theMaxValueIndex(int[] array) {

        int max = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        return index;
    }
}