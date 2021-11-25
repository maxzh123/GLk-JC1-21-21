package by.itAcademy.homeworks.arrays;

// Задание 18
// Создать массив из 10 элементов, заполнить его произвольными целочисленными значениями и
// вывести элементы, стоящие на четных позициях.

public class Task19 {
    public static void main(String[] args) {
        int array [] = new int[10];
        Task18.fillingTheArray(array);
        for (int i = 1; i < array.length; i = i + 2) { // i = 1 если нужно вывести элементы на четных позициях
            System.out.println(array[i]);              // i = 0 если нужно вывести элементы с четными индексами
        }
    }
}
