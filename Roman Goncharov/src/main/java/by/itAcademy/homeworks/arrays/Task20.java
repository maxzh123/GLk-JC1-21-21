package by.itAcademy.homeworks.arrays;

// Задание 20
// Создать массив из 10 элементов, заполнить его произвольными целочисленными значениями,
// вывести максимальный элемент массива и его индекс.

public class Task20 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Task18.fillingTheArray(array);
        int index = indexMaxElement(array);
        System.out.println("Максимальный элемент массива: " + array[index]);
        System.out.println("Индекс максимального элемента: " + index);
    }

    public static int indexMaxElement (int[] array) {
        int indexMax = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        return indexMax;
    }
}
