package by.itAcademy.homeworks.arrays;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysHelper {

    public static int[] arrayRandom(int a) {
        int [] arrayRandom = new int[a];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = (int) (Math.random()* 1000+1);
        }
        return arrayRandom;
    }

    public static int[] arraySort(int a, int[] array) {
        int [] arraySort = new int[a];
        Arrays.sort(arraySort);
        return arraySort;
    }
}

