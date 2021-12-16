package by.itAcademy.homeworks.enums;

/**
 * Задание 36
 * Написать метод, который выводит следующий сезон от заданного во входном параметре.
 * Входной параметр ввести с клавиатуры.
 */

import by.itAcademy.homeworks.regexp.SimpleInput;

public class Task36 {
    public static void main(String[] args) {
        String str = SimpleInput.getString("Введите один из сезонов года:");
        Seasons season = Seasons.valueOf(str.toUpperCase());
        System.out.println("Следующий сезон:\n" + Seasons.getNextSeason(season));
    }
}
