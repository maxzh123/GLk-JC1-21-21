package by.itAcademy.homeworks.types;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("введите кол-во сек:");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        System.out.println("Минут:" + i/60+"\n"+"Часов:" + i/3600 + "\n" +"Дней:"+ i/86400 +"\n"+"Недель:"+ i/604800 );
    }
}