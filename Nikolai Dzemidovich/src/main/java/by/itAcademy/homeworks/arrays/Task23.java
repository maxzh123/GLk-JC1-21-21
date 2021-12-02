package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task23 {
    public static void main(String[] args) {

        int n = 7;
        int[][] array = new int[n][n];
        getButterflyArray(array);

        for (int[] ints : array) {
            System.out.println(Arrays.toString(ints));
        }

    }

    public static int[][] getButterflyArray(int[][] array) {
        for (int i = 0; i < array.length / 2; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j < i || j >= array.length - i) {
                    array[i][j] = 0;
                } else array[i][j] = 1;
            }
        }
        for (int i = array.length / 2; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j > i || j < array.length - i - 1) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }
        return array;

    }
}
