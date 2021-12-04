package by.itAcademy.homeworks.arrays;

// Создайте переменную для массива из 10 элементов.
// Заполните его произвольными значениями целочисленного типа и выведите последний элемент массива на экран.

public class Task18 {
    public static void main(String[] args) {
        int [] array1 = ArraysHelper.arrayRandom(10);
        System.out.print(array1[9]);
    }

}
