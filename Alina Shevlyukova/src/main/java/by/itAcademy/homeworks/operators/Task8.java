package by.itAcademy.homeworks.operators;


import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        double a= input.nextDouble();
        int b = (int)a;
        if (a==1){
        System.out.println(b + " рубль");}
        else{
        System.out.println(b+" рублей");}
    }
}
