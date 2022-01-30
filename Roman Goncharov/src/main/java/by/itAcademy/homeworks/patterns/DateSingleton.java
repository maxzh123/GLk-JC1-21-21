package by.itAcademy.homeworks.patterns;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateSingleton {
    private static DateSingleton instance;

    private DateSingleton() {
    }

    public static DateSingleton getInstance() {
        if (instance == null) {
            instance = new DateSingleton();
        }
        return instance;
    }

    public void printCurrentDate() {
        LocalDate today = LocalDate.now();
        System.out.println("Текущая дата: " + today.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
    }
}