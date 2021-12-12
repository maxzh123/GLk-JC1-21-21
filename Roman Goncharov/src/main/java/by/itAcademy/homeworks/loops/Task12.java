package by.itAcademy.homeworks.loops;

/** Задание № 12
 * Вычислить факториал чисел от 0 до 10.
 */

public class Task12 {
    public static void main(String[] args) {
        System.out.println("0! = 1");
        int result = 1; // Факториал 0 - равен 1. Это правило.
        int i = 1; // Первое число в цикле.
        int lastNumber = 10; // Последнее число в цикле.
        while (i <= lastNumber) {
           result = result * i;
           System.out.println(i + "! = " + result);
           i++;
        }
    }
}