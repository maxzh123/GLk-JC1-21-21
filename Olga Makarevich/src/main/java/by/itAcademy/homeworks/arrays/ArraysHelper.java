package by.itAcademy.homeworks.arrays;

public class ArraysHelper {

    public static int[] arrayRandom(int a) {
        int [] arrayRandom = new int[a];
        for (int i = 0; i < arrayRandom.length; i++) {
            arrayRandom[i] = (int) (Math.random()* 1000+1);
        }
        return arrayRandom;
    }
}

