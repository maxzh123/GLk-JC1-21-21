package by.itAcademy.homeworks.lamda;

/**
 * Задание 61
 * Напишите программу, которая для всех четных значений длиной от 1 до 20 дюймов:
 * - печатает на экран значения в дюймах;
 * - переводит значения в сантиметры;
 * - печатает на экран сумму в сантиментах.
 */

import java.util.stream.IntStream;

public class Task61 {
    public static void main(String[] args) {
        double sum = IntStream.rangeClosed(1, 20)
                .filter((x) -> (x % 2 == 0))
                .peek(Task61::printInInches)
                .mapToDouble((x) -> x * 2.54)
                .peek(Task61::printInCm)
                .sum();
        System.out.println("\nСумма чисел в сантиметрах: " + sum);
    }

    public static void printInInches(int x) {
        System.out.print(x);
        System.out.print(" inch ");
    }

    public static void printInCm(double x) {
        System.out.print("= " + x);
        System.out.print(" cm\n");
    }
}