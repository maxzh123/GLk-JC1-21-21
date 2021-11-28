package by.itAcademy.homeworks.arrays;

import java.util.Random;

public class FillingTheArray {
    public static int[] Array(int a) {
        int[] array = new int[a];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

        return array;
    }
}
