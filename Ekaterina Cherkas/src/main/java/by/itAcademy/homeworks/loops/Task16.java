package by.itAcademy.homeworks.loops;
/** Задание 16
 *
 * Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на экран строку “Hope!”.
 */

public class Task16 {
    public static void main(String[] args) {
        for(int number = 1;number<=100;number++) {
            boolean i = ((number % 7 == 0));
            if (i == true)             {
                System.out.println(number + " Hope ");
            }  else {
            }
        }
    }
}
