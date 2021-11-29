package by.itAcademy.homeworks.loops;

/**Задание 16
 * > Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на
 * > экран строку “Hope!”.
 */

public class Task16 {
    public static void main(String[] args){
        for (int i = 1; i < 101; i++){
            if (i % 7 == 0)
                System.out.println("Hope! - " + i);
        }
    }
}
