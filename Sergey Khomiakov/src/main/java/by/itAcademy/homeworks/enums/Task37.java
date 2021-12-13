package by.itAcademy.homeworks.enums;

import by.itAcademy.homeworks.regexp.SimpleReader;

/** Написать метод, который в зависимости от сезона, выводит на экран сумму
 * дней в этом сезоне. Входной параметр ввести с клавиатуры.
 */

public class Task37 {
    public static void main(String[] args) {
        System.out.println("Введите сезон: WINTER, SPRING, SUMMER, AUTUMN");
        String season = SimpleReader.readLine();
        SeasonsOfTheYear.getNumbersOfDaysInSeason(SeasonsOfTheYear.valueOf(season));
    }
}
