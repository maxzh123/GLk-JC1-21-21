package by.itAcademy.homeworks.operators;

import java.util.Scanner;

//Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа. Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).

public class Task7 {
   public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Введите сторону а");
        int a = scr.nextInt();
        System.out.println("Введите сторону b");
        int b = scr.nextInt();
        System.out.println("Введите радиус r");
        int r = scr.nextInt();

        if (4 * r * r >= (a * a + b * b)) {
            System.out.println("Да, можно");
        } else {
            System.out.println("Нет, нельзя");
        }
    }
}
