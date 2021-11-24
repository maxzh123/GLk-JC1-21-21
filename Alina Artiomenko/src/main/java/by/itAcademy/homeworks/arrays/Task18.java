package by.itAcademy.homeworks.arrays;

/**Задание 18
 * 1. Создайть массив из 10 элементов.
 * 2. Заполнить произвольными значениями целочисленного типа
 * 3. Вывести последний элемент массива
 */

public class Task18 {
    public static void main(String[] args){
        int[] arrayFirst = new int[10];

        for (int i = 0; i < 10; i++){
            arrayFirst[i] = (int) (10 * Math.random());
        }

        System.out.println(arrayFirst[9]);
    }
}
