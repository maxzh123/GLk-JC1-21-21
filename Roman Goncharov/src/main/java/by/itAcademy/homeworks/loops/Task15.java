package by.itAcademy.homeworks.loops;

// Задание 15
// Найти среди чисел от 50 до 70 второе простое число и вывести его на экран.

public class Task15 {
    public static void main(String[] args) {
        int a = 0; // Переменная для определения a-ого простого числа из интервала чисел.
            for (int i = 50; i<=70; i++) {
                int j = 2;
                while (i%j != 0) {
                    j++;
                }
                if (i == j) {
                    a++;
                    if (a == 2) {
                        System.out.println(i);
                        break;
                    }
                }
            }
    }
}
