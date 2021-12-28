package by.itAcademy.homeworks.arrays;

/** Задание 21
 * Создать массив из 10 элементов, заполнить его произвольными целочисленными значениями,
 * определить сумму элементов между максимальным и минимальным элементами массива.
 */

public class Task21 {
    public static void main(String[] args) {
        int x = 10;
        int[] array = new int[x];
        Task18.fillingTheArray(array);
        System.out.println("Сумма элементов между максимальным и минимальным элементами массива равна: " +calcSum(array));
    }

    public static int calcSum(int[] array){
        int indexMax = IndexSearcher.getIndexMax(array);
        System.out.println("Максимальный элемент массива: " + array[indexMax]);
        System.out.println("Индекс максимального элемента: " + indexMax);
        int indexMin = IndexSearcher.getIndexMin(array);
        System.out.println("Минимальный элемент массива: " + array[indexMin]);
        System.out.println("Индекс минимального элемента: " + indexMin);
        return sumElementsOfArray(array, indexMax, indexMin);
    }

    public static int sumElementsOfArray (int[] array, int indexMax, int indexMin) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i > indexMax && i < indexMin) {
                sum = sum + array[i];
            } else if (i > indexMin && i < indexMax) {
                sum = sum + array[i];
            }
        }
        return sum;
    }
}
