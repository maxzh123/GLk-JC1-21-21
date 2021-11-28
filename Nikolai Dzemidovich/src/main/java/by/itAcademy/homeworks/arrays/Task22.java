package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task22 {
    public static void main(String[] args) {

        int[] array = Task18.randomArrays(10);

        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(reverseTheArray(array)));

        /* можно просто так
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " "); */
    }

    public static int[] reverseTheArray(int[] array) {

        int temp;

        for (int i = 0; i < array.length / 2; i++) {
            temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;
        }
        return array;
    }
}