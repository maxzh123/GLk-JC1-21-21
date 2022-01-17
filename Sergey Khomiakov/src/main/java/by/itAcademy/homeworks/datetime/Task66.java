package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/** Задание 66
 * 1)  От текущей даты вывести на экран дату, которая была 60 дней назад.
 */

public class Task66 {
    public static void main(String[] args) {
        getDate60DaysBeforeCurrentDate();
    }

    public static void getDate60DaysBeforeCurrentDate(){
        LocalDate date = LocalDate.now();
        System.out.println("Текущая дата: " + date.format(DateTimeFormatter.ofPattern("d-MMM-yyyy")));
        date = date.minusDays(60);
        System.out.println("Дата, на 6о дней ранее текущей: " + date.format(DateTimeFormatter.ofPattern("d-MMM-yyyy")));
    }
}
