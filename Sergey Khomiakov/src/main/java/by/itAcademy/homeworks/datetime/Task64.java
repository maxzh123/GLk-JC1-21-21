package by.itAcademy.homeworks.datetime;

import by.itAcademy.homeworks.regexp.SimpleReader;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

/** Задание 64
 * 1) Ввести с клавиатуры номер месяца текущего года.
 * 2) Вывести на экран все его даты в формате d::MMM::uuuu.
 */

public class Task64 {
    public static void main(String[] args) {
        System.out.println("Введите месяц в цифровом формате, чтобы узнать количество дней в нем:");
        int month = SimpleReader.readInt();
        LocalDate date = LocalDate.now();
        showAllDayInChosenMonth(date.getYear(), month);
    }

    public static void showAllDayInChosenMonth(int year, int month){
        int day = 1;
        LocalDate date = LocalDate.of(year, month, day);
        LocalDate dateWithLastDayOfMonth = date.with(TemporalAdjusters.lastDayOfMonth());

        while(!date.isAfter(dateWithLastDayOfMonth)){
            System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::yyyy")));
            date = date.plusDays(1);
        }
    }
}
