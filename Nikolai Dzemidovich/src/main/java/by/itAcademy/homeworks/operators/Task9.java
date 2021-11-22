package by.itAcademy.homeworks.operators;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the day:");
        int day = scr.nextInt();
        System.out.println("Enter the month:");
        int month = scr.nextInt();
        System.out.println("Enter the year:");
        int year = scr.nextInt();
        if (day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            System.out.println("Next day:" + 1 + "." + ++month + "." + year);
        } else if (day == 31 && month == 12) {
            System.out.println("Next day:" + 1 + "." + 1 + "." + ++year);
        } else if (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("Next day:" + 1 + "." + ++month + "." + year);
        } else if (day == 28 && month == 2) {
            System.out.println("Next day:" + 1 + "." + ++month + "." + year);
        } else if((day > 28 && month == 2) || (day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) || day > 31 || month > 12){
            System.out.println("Error, wrong date");
        } else {
            System.out.println("Next day" + ++day + "." + month + "." + year);
        }

    }
}
