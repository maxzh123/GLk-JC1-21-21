package by.itAcademy.homeworks.loops;

/**
 * Задание 12
 *
 * Вычислить факториал целых чисел от 0 до 10 с помощью цикла while.
 */
public class Task12 {
    public static void main(String[] args) {
        int factorial = 1;
        int value = 0;

        while (value <= 10){
            System.out.println(value + "! = " + factorial);
            value++;
            factorial *= value;
        }
    }
}
