package by.itAcademy.homeworks.arrays;

/**
 * Задание 21
 *
 * Создать переменную для массива из 10 элементов.
 * Заполнить его произвольными значениями целочисленного типа.
 * Определить сумму элементов массива, расположенных между минимальным и максимальным значениями.
 * Если значений максимальных и минимальных несколько,
 * то необходимо взять максимальное значение разницы индексов
 * между максимальным и минимальным значениями.
 *
 */

public class Task21 {
    public static void main(String[] args) {
        int variable = 10;
        int [] array = new int[variable];
        Task18.randomFilling(array);
        System.out.println("The sum of the elements between the maximum and minimum elements of the array is: "
                            + sumOfArrayElements(array));
    }

    public static int minElementIndex (int[] array){
        int minElement = array[0];
        int minIndex = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < minElement){
                minElement = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int checkingValues (int [] array, int minIndex, int maxIndex){
        int number = 0;
        for (int i = 0; i < array.length; i++){
            if (i < maxIndex && i > minIndex){
                number += array[i];
            } else if (i > maxIndex && i < minIndex) {
                number += array[i];
            }
        }
        return number;
    }

    public static int sumOfArrayElements (int [] array){
        int minIndex = minElementIndex(array);
        int maxIndex = Task20.maxElementIndex(array);
        return checkingValues(array, maxIndex, minIndex);
    }
}
