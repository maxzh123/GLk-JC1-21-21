package by.itAcademy.homeworks.enums;

import by.itAcademy.homeworks.regexp.SimpleReader;

/** Написать метод, который в зависимости от сезона, выводит на экран сумму
 * дней в этом сезоне. Входной параметр ввести с клавиатуры.
 */

public class Task37 {
    public static void main(String[] args) {
        System.out.println("Введите один из следующих сезонов: WINTER, SPRING, SUMMER, AUTUMN");
        String season = SimpleReader.readLine();
        SeasonsOfTheYear tmpSeason = SeasonsOfTheYear.valueOf(season.toUpperCase());
        System.out.println("Количество дней - " + SeasonsOfTheYear.getNumbersOfDaysInSeason(tmpSeason));
    }
}
