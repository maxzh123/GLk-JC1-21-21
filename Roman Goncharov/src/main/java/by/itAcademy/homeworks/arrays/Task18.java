package by.itAcademy.homeworks.arrays;

// Задание 18
// Создать массив из 10 элементов, заполнить его произвольными целочисленными значениями и
// вывести последний элемент массива на экран.

public class Task18 {
    public static void main(String[] args) {
        int[] array = new int[10];
        fillingTheArray(array);
        System.out.println(array[array.length - 1]);
    }

    public static int[] fillingTheArray(int[] a) {
        int[] newArray = a;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i*2;
        }
        return newArray;
    }
}
