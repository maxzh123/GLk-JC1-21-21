package by.itAcademy.homeworks.types;

import java.util.Scanner;

public class Task5 {
        public static void main(String[] args) {
                Scanner scn = new Scanner(System.in);
                System.out.print("Введите число: ");
                double time = scn.nextDouble();
                System.out.println("Скунды = " + time);
                System.out.println("Минуты = " + ((int)time / 60));
                System.out.println("Часы = " + ((int)time / 60 / 60));
                System.out.println("Дни = " + ((int)time / 60 / 60 / 24));
                System.out.println("Недели = " + ((int)time / 60 / 60 / 24 / 7));
        }
}
