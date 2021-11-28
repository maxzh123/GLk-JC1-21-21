package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите A");
        int a = scn.nextInt();
        System.out.println("Введите B");
        int b = scn.nextInt();
        System.out.println("Введите E");
        int e = scn.nextInt();
        System.out.println("Введите F");
        int f = scn.nextInt();
        System.out.println("Введите С");
        int c = scn.nextInt();
        System.out.println("Введите D");
        int d = scn.nextInt();


        if ((e >= (c + a)) && (f >= d && f >= b)) {
            System.out.println("Помещаются");
        } else if ((e >= (c + b)) && (f >= d && f >= a)) {
            System.out.println("Помещаются");
        } else if ((e >= (d + a)) && (f >= c && f >= b)) {
            System.out.println("Помещаются");
        } else if ((e >= (d + b)) && (f >= c && f >= a)) {
            System.out.println("Помещаются");
        } else if ((f >= (c + a)) && (e >= d && e >= b)) {
            System.out.println("Помещаются");
        } else if ((f >= (c + b)) && (e >= d && e >= a)) {
            System.out.println("Помещаются");
        } else if ((f >= (d + a)) && (e >= c && e >= b)) {
            System.out.println("Помещаются");
        } else if ((f >= (d + b)) && (e >= c && e >= a)) {
            System.out.println("Помещаются");
        } else
            System.out.println("Не помещаются");
    }
}

