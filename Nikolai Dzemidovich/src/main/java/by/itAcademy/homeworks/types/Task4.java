package by.itAcademy.homeworks.types;
//Написать метод, который принимает на вход два целых числа, делает их суммирование и складывает результат с произведением двух этих чисел, и возвращает полученный результат из метода. Передать на вход в метод любые два числа. Вывести полученный результат работы метода на экран
import java.util.Scanner;

public class Task4 {
  
  public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firstNumber = scr.nextInt();

        System.out.println("Введите второе число");
        int secondNumber = scr.nextInt();

        System.out.println((firstNumber+secondNumber) + (firstNumber*secondNumber));


    }
}
