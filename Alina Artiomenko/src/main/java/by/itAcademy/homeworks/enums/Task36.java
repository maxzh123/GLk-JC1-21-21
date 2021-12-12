package by.itAcademy.homeworks.enums;

import java.util.Scanner;

/**Задание 36
 * 1. Написать метод, который выводит следующий сезон от заданного во входном параметре.
 * 2. Входной параметр ввести с клавиатуры.
 */

public class Task36 {
    public static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.print("Сезон (Winter, Sprin, Summer, Autumn) = ");
        String seasonInput = input.next();

        if (seasonInput.equals("Winter") || seasonInput.equals("Sprin") ||
            seasonInput.equals("Summer") || seasonInput.equals("Autumn")) {
            SeasonsOfTheYear season = SeasonsOfTheYear.valueOf(seasonInput);
            season.nextIndexOfSeason(season);
            System.out.println(season.printSeasin());
        } else {
            System.out.println("Неверное значение!");
        }

    }
}
