package by.itAcademy.homeworks.enums;

import java.util.Scanner;

/**Задание 37
 * 1. Написать метод, который в зависимости от сезона, выводит на экран сумму дней в этом сезоне.
 * 2. Входной параметр ввести с клавиатуры.
 * */
public class Task37 {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.print("Сезон (Winter, Sprin, Summer, Autumn) = ");
        String seasonInput = input.next();

        if (seasonInput.equals("Winter") || seasonInput.equals("Sprin") ||
            seasonInput.equals("Summer") || seasonInput.equals("Autumn")) {
            SeasonsOfTheYear season = SeasonsOfTheYear.valueOf(seasonInput);
            System.out.println(season.printDays(season));
        } else {
            System.out.println("Неверное значение!");
        }
    }
}
