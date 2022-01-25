package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;

/**Задание 66
 * 1. От текущей даты вывести на экран дату, которая была 60 дней назад
 */

public class Task66 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Сегодня: " + date);
        date = date.minusDays(60);
        System.out.println("Дата 60 дней назад: " + date);
    }
}
