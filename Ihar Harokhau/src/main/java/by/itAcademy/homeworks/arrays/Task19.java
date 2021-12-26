package by.itAcademy.homeworks.arrays;

/**
 * Задание 19
 *
 * Создать переменную для массива из 10 элементов.
 * Заполнить его произвольными значениями целочисленного типа.
 * Вывести на экран элементы, стоящие на четных позициях.
 *
 */

public class Task19 {
    public static void main(String[] args) {
        int variable = 10;
        int[] array = new int[variable];
        Task18.randomFilling(array);
        for (int i = 1; i < array.length; i += 2){
            System.out.print(array[i] + " ");
        }
    }
}
