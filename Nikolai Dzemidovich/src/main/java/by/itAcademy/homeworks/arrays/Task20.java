package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task20 {
    public static void main(String[] args) {

        int[] array = Task18.randomArrays(10);
        System.out.println(Arrays.toString(array));

        int maxValue = maxValueOfArray(array);
        System.out.println(maxValue);

    }

    public static int maxValueOfArray(int[] array) {

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.print("Максимальное значение массива = ");
        return max;
    }
}

