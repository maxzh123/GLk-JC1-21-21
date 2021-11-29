package by.itAcademy.homeworks.operators;

// Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner print = new Scanner(System.in);
        System.out.println("Введите день");
        int a = print.nextInt();
        System.out.println("Введите месяц");
        int b = print.nextInt();
        System.out.println("Введите год");
        int c = print.nextInt();

        if (a <= 30 && (b == 1 | b == 3 | b == 5 | b == 7 | b == 8 | b == 10 | b == 12)) {
            System.out.println("Дата следующего дня: " + ++a + "." + b + "." + c);
        } else if (a == 31 && (b == 1 | b == 3 | b == 5 | b == 7 | b == 8 | b == 10 | b == 12)) {
            a = 0;
            b++;
            System.out.println("Дата следующего дня: " + ++a + "." + b + "." + c);
        } else if (a <= 29 && (b == 4 | b == 6 | b == 9 | b == 11)) {
            System.out.println("Дата следующего дня: " + ++a + "." + b + "." + c);
        } else if (a == 30 && (b == 4 | b == 6 | b == 9 | b == 11)) {
            a = 0;
            b++;
            System.out.println("Дата следующего дня: " + ++a + "." + b + "." + c);
        } else if (a <= 27 && b == 2) {
            System.out.println("Дата следующего дня: " + ++a + "." + b + "." + c);
        } else if (a == 28 && b == 2 && c % 4 == 0) {
            System.out.println("Дата следующего дня: " + ++a + "." + b + "." + c);
        } else if (a == 29 && b == 2 && c % 4 == 0) {
            a = 1;
            b++;
            System.out.println("Дата следующего дня: " + a + "." + b + "." + c);
        }
        else {
            System.out.println("Дата введена некорректно!");
        }
    }
}