package by.itAcademy.homeworks.types;
import java.util.Scanner;

/*Написать метод, который принимает на вход два целых числа, делает их суммирование и
* складывает результат с произведением двух этих чисел, и возвращает полученный результат
 * из метода. Передать на вход в метод любые два числа.
 * Вывести полученный результат работы метода на экран
 */
public class Task4 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int result = operation(a,b);
        System.out.println("Result = "+result);
    }
    public static int operation(int a, int b){
        return a+b+(a*b);
    }

}

