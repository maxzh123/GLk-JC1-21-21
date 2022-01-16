package by.itAcademy.homeworks.datetime;

/**
 * Задание 66
 * От текущей даты вывести на экран дату, которая была 60 дней назад.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task66 {
    public static void main(String[] args) {
        pastDateDisplay(60);
    }

    public static void pastDateDisplay(int days) {
        LocalDate today = LocalDate.now();
        System.out.println("Текущая дата: " + today.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
        System.out.println("Дата, которая была " + days + " дней назад: " +
                today.minusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }
}