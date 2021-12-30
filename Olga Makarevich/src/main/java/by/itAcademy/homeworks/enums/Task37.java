package by.itAcademy.homeworks.enums;

// Написать метод, который в зависимости от сезона, выводит на экран сумму дней в этом сезоне.
// Входной параметр ввести с клавиатуры.

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сезон");
        try {
        String str1 = scanner.nextLine();
        Season.getNumberOfDay(Season.valueOfString(str1));
        } catch (NullPointerException e) {
            System.out.println("Нет такого сезона");
        }
    }
}//