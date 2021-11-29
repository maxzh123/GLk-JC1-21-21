package by.itAcademy.homeworks.loops;

/** Задание 13
 *
 * Вычислить произведение чисел от 1 до 25 с помощью цикла do while.
 */

public class Task13 {
    public static void main(String[] args){
    int num = 1;
    int multi = 1;
    do { multi *= num;
    num++;
    }while (num <= 25);
        System.out.println("Произведение чисел от 1 до 25 = " + multi );
    }
}
