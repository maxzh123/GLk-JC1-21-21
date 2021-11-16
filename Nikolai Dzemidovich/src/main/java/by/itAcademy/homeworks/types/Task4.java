package by.itAcademy.homeworks.types;

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
