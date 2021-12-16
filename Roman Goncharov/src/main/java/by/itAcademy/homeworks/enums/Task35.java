package by.itAcademy.homeworks.enums;

/**
 * Задание 35
 * Создать enum, который описывает сезоны года. Добавить поля description и countOfDays.
 * Вывести на экран все константы сезоны года.
 */

public class Task35 {
    public static void main(String[] args) {
        for (Seasons season: Seasons.values()) {
            Seasons.displayingInfoAboutSeason(season);
        }
    }
}
