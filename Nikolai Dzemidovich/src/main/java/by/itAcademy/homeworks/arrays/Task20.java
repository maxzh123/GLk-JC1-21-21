package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {

        int[] array = Task18.randomArrays(10);
        System.out.println(Arrays.toString(array));

        int maxIndex = MyArraysHelper.theMaxValueIndex(array);
        int maxValue = array[maxIndex];
        System.out.println("Максимальный элемент = " + maxValue + ", и его индекс = " + maxIndex);

    }
}

