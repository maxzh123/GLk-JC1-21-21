package by.itAcademy.homeworks.types;

import java.util.Scanner;

public class Task4 {

    public static int getMath(int a, int b) {
        return (a + b) + (a * b);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        System.out.println("Результат = " + getMath(a, b));

    }
}
