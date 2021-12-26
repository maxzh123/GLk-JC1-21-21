package by.itAcademy.homeworks.arrays;

/**
 * Задание 20
 *
 * Создать переменную для массива из 10 элементов.
 * Заполнить его произвольными значениями целочисленного типа.
 * Найти максимальный элемент и вывести его индекс.
 *
 */

public class Task20 {
    public static void main(String[] args) {
        int variable = 10;
        int [] array = new int[variable];
        Task18.randomFilling(array);
        System.out.println("Maximum array element: " + array[maxElementIndex(array)]);
        System.out.println("Maximum element index: " + maxElementIndex(array));
    }
    public static int maxElementIndex (int[] array){
        int maxElement = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > maxElement){
                maxElement = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
