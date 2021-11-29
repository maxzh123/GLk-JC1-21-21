package by.itAcademy.homeworks.arrays;

/*Создайте переменную для массива из 10 элементов. Заполните его
произвольными значениями целочисленного типа. Выведите на экран, переверните
и снова выведите на экран (при переворачивании нежелательно создавать еще один
массив).*/

import java.util.Arrays;

public class Task22 {
    public static void main(String[] args) {
        int[] array = Task18.getHelperToCreateArray(10);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(getUpsideDownToArray(array)));

    }

    public static int[] getUpsideDownToArray(int[] array){
        int tmp;
        for (int i = 0; i <array.length/2;i++){
            tmp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = tmp;
        }
        return array;

    }
}
