package by.itAcademy.homeworks.enums;

// Написать метод, который в зависимости от сезона, выводит на экран сумму дней в этом сезоне.
// Входной параметр ввести с клавиатуры.

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сезон");
        String str1 = scanner.nextLine();
        System.out.println(Season.getNumberOfDay(Season.valueOfString(str1)));
    }
}

// при неправильном вводе наименования сезона не работает - объясните, пожалуйста почему