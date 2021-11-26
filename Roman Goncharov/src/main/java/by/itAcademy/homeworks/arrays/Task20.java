package by.itAcademy.homeworks.arrays;

// Задание 20
// Создать массив из 10 элементов, заполнить его произвольными целочисленными значениями,
// вывести максимальный элемент массива и его индекс.

public class Task20 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Task18.fillingTheArray(array);
        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Максимальный элемент массива: " + max);
        System.out.println("Индекс максимального элемента: " + index);
    }
}
