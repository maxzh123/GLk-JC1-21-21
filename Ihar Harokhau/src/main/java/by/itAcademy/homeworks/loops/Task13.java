package by.itAcademy.homeworks.loops;

/**
 * Задание 13
 *
 * Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
 */
public class Task13 {
    public static void main(String[] args) {
        int value = 25;
        int i = 1;

        do
        {
           i *= value;
           value--;
        }
        while (value >= 1);
        System.out.println("Произведение чисел от 1 до 25 = " + i);
    }
}
