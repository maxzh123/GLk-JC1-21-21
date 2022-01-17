package by.itAcademy.homeworks.datetime;

/**
 * Задание 64
 * Ввести с клавиатуры номер месяца текущего года. Вывести на экран все его даты в формате d::MMM::yyyy.
 */

import by.itAcademy.homeworks.regexp.SimpleInput;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class Task64 {
    public static void main(String[] args) {
        int month = SimpleInput.getNumber("Введите номер месяца:");
        displayingDaysOfMonth(month, 2022);
    }

    public static void displayingDaysOfMonth(int monthNumber, int year) {
        LocalDate localDate = LocalDate.of(year, monthNumber, 1);
        int lastDayOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
        for (int i = localDate.getDayOfMonth(); i <= lastDayOfMonth; i++) {
            System.out.println(localDate.format(DateTimeFormatter.ofPattern("d::MMM::yyyy")));
            localDate = localDate.plusDays(1);
        }
    }
}