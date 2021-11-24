package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        double a= input.nextDouble();
    if (a==1) {
        System.out.println(a + "рубль");
    }else{
        System.out.println(a+"рублей");
    }
    }
}
