package by.itAcademy.homeworks.enums;

// Написать метод, который выводит следующий сезон от заданного во входном параметре.
// Входной параметр ввести с клавиатуры.

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите сезон года");
        try {
            String season = scr.nextLine();
            Season.getNextSeason(Season.valueOfString(season));
        } catch (NullPointerException e) {
            System.out.println("Нет такого сезона");
        }

    }
}