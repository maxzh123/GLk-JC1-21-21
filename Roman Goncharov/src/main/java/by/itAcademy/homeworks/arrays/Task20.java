package by.itAcademy.homeworks.arrays;

/** Задание 20
 * Создать массив из 10 элементов, заполнить его произвольными целочисленными значениями,
 * вывести максимальный элемент массива и его индекс.
 */

public class Task20 {
    public static void main(String[] args) {
        int x = 10;
        int[] array = new int[x];
        Task18.fillingTheArray(array);
        System.out.println("Максимальный элемент массива: " + array[indexMaxElement(array)]);
        System.out.println("Индекс максимального элемента: " + indexMaxElement(array));
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
