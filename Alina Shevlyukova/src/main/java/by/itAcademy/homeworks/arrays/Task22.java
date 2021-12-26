package by.itAcademy.homeworks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task22 {
    private static int i;

    static void returnReversArray(int[] array) {
        int temp;
        for (int i = array.length - 1, j = 0; i >= array.length / 2; i--, j++) {
            temp = array[j];
            array[j] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Размер массива?");
        int sizeArray = in.nextInt();

        int[] Array = new int[sizeArray];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int) (Math.random() * 5 + 2);
        }
        System.out.println("Первоначальный массив: ");
        for (int key : Array) {
            System.out.println(key + " ");
        }

        System.out.println("Перевёртыш: ");
        returnReversArray(Array);
        for (int key : Array) {
            System.out.println(key + " ");
        }
    }
}
