package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**Задание 21
 * 1. Задать переменную для массива из 10 элементов
 * 2. Заполнить рандомными значениями целочисленного типа
 * 3. Найти MAX и MIN
 * 4. Найти сумма элементов массива, расположенные между MAX и MIN (включая)
 * 5. Если MAX и MIN несколько, то необходимо взять
 * > MAX значение разницы индексов между MAX и MIN значениями.
 */

public class Task21 {
    public static void main(String[] args){
        int sizeArray = 10;
        int[] arrayOfNumber = Task21.fillArrayWithNumber(sizeArray);
        System.out.println(Arrays.toString(arrayOfNumber));

        int minValue = getMinNumberOfArray(arrayOfNumber);
        int maxValue = getMaxNumberOfArray(arrayOfNumber);
        System.out.println("Индекс MIN - " + minValue);
        System.out.println("Индекс MAN - " + maxValue);
        System.out.println("Сумма элементов между MIN и MAX (включая) = " + getSumBetweenMaxMin(arrayOfNumber,minValue,maxValue));
    }

    //наполняем массив рандомными числами типа int
    public static int[] fillArrayWithNumber(int size){
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 10 + 9);
        }
        return array;
    }

    //поиск MAX
    public static int getMaxNumberOfArray(int[] arr){
        int maxValue = arr[0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++){
            if (maxValue <= arr[i]){
                maxValue = arr[i];
                indexMax = i;
            }
        }
        return indexMax;
    }

    //поиск MIN
    public static int getMinNumberOfArray(int[] arr){
        int minNum = arr[0];
        int indexMin = 0;
        for (int i = 0; i <arr.length; i++){
            if (minNum > arr[i]){
                minNum = arr[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    //сумма элементов массива между MAX и MIN
    public static int getSumBetweenMaxMin(int[]arr, int indMax, int indMin){
        int sum = 0;
        for (int i = Math.min(indMax, indMin); i <= Math.max(indMax, indMin); i++){
            sum += arr[i];
        }
        return sum;
    }

}
