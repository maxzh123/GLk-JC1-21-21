package by.itAcademy.homeworks.loops;

/**
 * Задание 14
 *
 * Посчитать сумму цифр числа 7893823445 с помощью цикла do while.
 */

public class Task14 {
    public static void main(String[] args) {
        long number = 7893823445L;
        System.out.println("Сумма числа 7893823445 равна " + sumNumber(7893823445L));
    }

    public static int sumNumber (long number) {
        int sum = 0;
        do
        {
            sum += number % 10;
            number /= 10;
        }
        while (number > 0);
        return sum;
    }
}
