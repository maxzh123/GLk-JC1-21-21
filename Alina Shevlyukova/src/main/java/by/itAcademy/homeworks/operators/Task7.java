package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = input.nextInt();
        System.out.print("Введите b: ");
        int b = input.nextInt();
        if (a > b) {
            int radius = a / 2;
            System.out.println("Радиус= " + radius);
        } else {
            int radius = b / 2;
            System.out.println("Радиус= " + radius+". " + "Закрыть картонкой можно.");
        }
    }
}
