package by.itAcademy.homeworks.enums;

import by.itAcademy.homeworks.regexp.SimpleReader;

/** Написать метод, который выводит следующий сезон от заданного во входном
 * параметре. Входной параметр ввести с клавиатуры.
 */

public class Task36 {
    public static void main(String[] args) {
        System.out.println("Введите сезон: WINTER, SPRING, SUMMER, AUTUMN");
        String season = SimpleReader.readLine();

        System.out.print("Следующий сезон - это ");
        System.out.println(SeasonsOfTheYear.nextSeason(SeasonsOfTheYear.valueOf(season.toUpperCase())));
    }
}
