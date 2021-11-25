package by.itAcademy.homeworks.operators;

import java.util.Scanner;


public class Task6 {

    public static boolean last() {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = a % 10;
        return b == 7;
    }

    public static void main(String[] args) {
        System.out.println(last());

    }


}
