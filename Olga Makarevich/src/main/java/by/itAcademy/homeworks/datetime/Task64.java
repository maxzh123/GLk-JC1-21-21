package by.itAcademy.homeworks.datetime;

//Ввести с клавиатуры номер месяца текущего года. Вывести на экран все его даты в формате d::MMM::uuuu.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Task64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int i = scanner.nextInt();
        printDates(i);
    }

    public static void printDates(int i) {
        LocalDate date = LocalDate.now();
        LocalDate date1 = date.withMonth(i);
        LocalDate a = date1.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate b = date1.with(TemporalAdjusters.lastDayOfMonth());
        while (a.isBefore(b)) {
            System.out.println(a.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
            a.plusDays(10);
        }
    }
}
