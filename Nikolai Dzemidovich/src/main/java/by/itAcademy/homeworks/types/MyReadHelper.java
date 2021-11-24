package by.itAcademy.homeworks.types;

import java.util.Scanner;

public class MyReadHelper {

    static final private Scanner scr = new Scanner(System.in);

    static public Integer readInt(String title) {
        System.out.println("Введите " + title);
        return scr.nextInt();
    }

    static public String readLine(String title) {
        System.out.println("Введите " + title);
        return scr.nextLine();
    }
}