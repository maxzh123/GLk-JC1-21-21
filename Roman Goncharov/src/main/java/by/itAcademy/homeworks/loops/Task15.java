package by.itAcademy.homeworks.loops;

/** Задание № 15
 * Найти среди чисел от 50 до 70 второе простое число и вывести его на экран.
 */

public class Task15 {
    public static void main(String[] args) {
        int initialNumber = 50;
        int endNumber = 70;
        System.out.println("Второе простое число: " +secondPrimeNumber(initialNumber,endNumber));
    }

    public static int secondPrimeNumber (int x, int y) {
        int a = 0; // Счётчик для определения 2-ого простого числа
        for (int i = x; i <= y; i++) {
            int j = 2;
            while (i%j != 0) {
                j++;
            }
            if (i == j) {
                a++;
                if (a == 2) {
                    x = i;
                    break;
                }
            }
        }
        return x;
    }
}
