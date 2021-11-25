package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task7 {

    public static double diagonal() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первую сторону квадрата: ");
        int a = scn.nextInt();
        System.out.println("Введите вторую сторону квадрата: ");
        int b = scn.nextInt();
        return Math.sqrt(a*b);
    }
    public static void dirka() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите радиус круга: ");
        int r = scn.nextInt();
        if (diagonal()>r) {
            System.out.println("Закрыть нельзя");
        } else {
            System.out.println("Закрыть можно");
        }
    }

    public static void main(String[] args) {
        dirka();
    }
}
