package by.itAcademy.homeworks.arrays;

import java.util.Arrays;

/**Задание 22
 * 1. Задать переменную для массива из 10 элементов
 * 2. Заполнить рандомными значениями целочисленного типа
 * 3. Вывести его на экран
 * 4. Перевернуть массив и снова его вывести
 * !!!НОВЫЙ МАССИВ НЕ СОЗДАВАТЬ
 */

public class Task22 {
    public static void main(String[] args) {
        int sizeArray = 10;

        int[] array = fillArrayWithNumber(sizeArray);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(flipArray(array)));

    }

    //наполняем массив рандомными числами типа int
    public static int[] fillArrayWithNumber(int size){
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * 10 + 9);
        }
        return array;
    }

    //переворачивает массив
    public static int[] flipArray(int[] arr){
        int a;
        for (int i = 0; i <arr.length / 2; i++){
            a = arr[i];
            arr[i] = arr[arr.length-1 - i];
            arr[arr.length-1 - i] = a;
        }
        return arr;
    }
}
