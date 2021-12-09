package by.itAcademy.homeworks.loops;

/** Задание № 14
 * Посчитать сумму цифр заданного числа.
 */

public class Task14 {
    public static void main(String[] args) {
        long num = 7893823445L;
        System.out.println("Сумма цифр заданного числа равна " + sumNumbers(num));
    }

    public static long sumNumbers(long num) {
        long sum = 0;
        do {
            long a = num % 10;
            num = num / 10;
            sum = sum + a;
        } while (num != 0);
        return sum;
    }
}
