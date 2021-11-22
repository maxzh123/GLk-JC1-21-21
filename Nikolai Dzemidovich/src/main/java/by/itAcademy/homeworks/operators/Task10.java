package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Введите стороны первого дома");
        int a = scr.nextInt(), b = scr.nextInt();
        System.out.println("Введите стороны второго дома");
        int c = scr.nextInt(), d = scr.nextInt();
        System.out.println("Введите стороны участка");
        int e = scr.nextInt(), f = scr.nextInt();
        if(Math.max(a,b) <= Math.max(e,f) && Math.max(c,d) <= Math.max(e,f) && Math.min(a,b) <= Math.min(e,f) && Math.min(c,d) <= Math.min(e,f)){
            if((e*f) >= (a*b) + (c*d)){
                System.out.println("Дома помещаются на участке");
            } else {
                System.out.println("Дома не помещаются на учатске");
            }
        } else {
            System.out.println("Дома не помещаются на учатске");
        }
    }
}
