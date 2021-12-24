package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

public class Task21 {
    public static void main(String[] args) {
        int sizeArray = 10;
        int[] arrayOfNumber = xArray(sizeArray);
        System.out.println(Arrays.toString(arrayOfNumber));
        System.out.println("Сумма между Min и Max = " + calcSum(arrayOfNumber));
    }

    public static int calcSum(int[] arrayOfNumber) {
        System.out.println(Arrays.toString(arrayOfNumber));
        int minValue = getMinimumIndexInArray(arrayOfNumber);
        int maxValue = getMaximumIndexInArray(arrayOfNumber);
        System.out.println("Индекс Min - " + minValue);
        System.out.println("Индекс Max - " + maxValue);
        return getSumBetweenMaxAndMin(arrayOfNumber, minValue, maxValue);
    }

    public static int[] xArray(int size) {
        int[] xArray = new int[10];
        for (int i = 0; i < 10; i++) {
            xArray[i] = (int) (10 * Math.random());
        }
        return xArray;
    }

    public static int getMaximumIndexInArray(int[] xArray) {

        int maxValue = xArray[0];
        int indexMax = 0;

        for (int i = 1; i < xArray.length; i++) {
            if (xArray[i] > maxValue) {
                maxValue = xArray[i];
                indexMax = i;

            }
        }
        return indexMax;
    }

    public static int getMinimumIndexInArray(int[] xArray) {

        int minValue = xArray[0];
        int indexMin = 0;

        for (int i = 1; i < xArray.length; i++) {
            if (xArray[i] <= minValue) {
                minValue = xArray[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    public static int getSumBetweenMaxAndMin(int[] xArray, int IndexMax, int IndexMin) {
        int sum = 0;
        for (int i = IndexMax + 1; i < IndexMin; i++) {
            sum += xArray[i];
        }
        return sum;
    }

}

