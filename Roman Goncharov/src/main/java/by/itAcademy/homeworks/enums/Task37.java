package by.itAcademy.homeworks.enums;

/**
 * Задание 37
 * Написать метод, который в зависимости от сезона, выводит на экран сумму дней в этом сезоне.
 * Входной параметр ввести с клавиатуры.
 */

import by.itAcademy.homeworks.regexp.SimpleInput;

public class Task37 {
    public static void main(String[] args) {
        String str = SimpleInput.getString("Введите один из сезонов года:");
        Seasons season = Seasons.valueOf(str.toUpperCase());
        System.out.println("Количество дней в этом сезоне: " + Seasons.getCountOfDaysInSeason(season));
    }
}
