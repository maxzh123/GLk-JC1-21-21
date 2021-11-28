package by.itAcademy.homeworks.loops;
/** Задание 12
 *
 * Вычислить факториал целых чисел от 0 до 10 с помощью цикла while
 */


public class Task12 {
    public static void main(String[] args) {
        int n = 11;
        int factorial = 1;
        int input = 0;

        while(input < n) {
            System.out.println("Factorial of "+ input + " is " + factorial);
            input++;
            factorial *= input;
            }
        }
    }
