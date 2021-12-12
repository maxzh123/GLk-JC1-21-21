package by.itAcademy.homeworks.loops;

/** Задание № 13
 * Вычислить произведение чисел от 1 до 25.
 */

public class Task13 {
    public static void main(String[] args) {
        int firstNumber = 1;
        int lastNumber = 25;
        System.out.println("Произведение чисел от "+firstNumber+ " до "+lastNumber + " равно:");
        System.out.print(productOfNumbers(firstNumber,lastNumber));
    }

    public static double productOfNumbers (int i, int number) {
        double result = 1;
        do {
            result = result * i;
            i++;
        } while (i <= number);
        return result;
    }
}
