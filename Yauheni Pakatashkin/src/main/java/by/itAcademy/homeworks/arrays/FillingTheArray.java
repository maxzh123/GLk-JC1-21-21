package by.itAcademy.homeworks.arrays;

import java.util.Random;

public class FillingTheArray {
    public static int[] array(int a) {
        return array(a,10);
    }

    public static int[] array(int a,int limit) {
        int[] array = new int[a];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(limit)+1;
        }

        return array;
    }
}
