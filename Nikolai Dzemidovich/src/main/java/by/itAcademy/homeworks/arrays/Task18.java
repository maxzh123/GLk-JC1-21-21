package by.itAcademy.homeworks.arrays;

import java.util.Arrays;
import java.util.Random;

public class Task18 {
    public static void main(String[] args) {

        int[] sca = Task18.randomArrays(10);
        System.out.println(Arrays.toString(sca));

    }

    public static int[] randomArrays(int a) {
        int[] array = new int[a];

        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(199);
        }

        return array;
    }
}
