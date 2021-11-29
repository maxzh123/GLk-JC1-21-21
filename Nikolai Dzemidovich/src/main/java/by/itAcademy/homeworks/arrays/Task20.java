package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {

        int[] array = Task18.randomArrays(10);
        System.out.println(Arrays.toString(array));

        int maxIndex = theMaxValueIndex(array);
        int maxValue = array[maxIndex];
        System.out.println("Максимальный элемент = " + maxValue + ", и его индекс = " + maxIndex);

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

