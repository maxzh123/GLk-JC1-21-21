package by.itAcademy.homeworks.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**Задание 65
 * 1. От текущей даты вывести расписание всех встреч,
 *    которые происходят еженедельно в 13:00 в течение 2 месяцев
 */

public class Task65 {
    public static void main(String[] args) {
        final int hour = 13;
        final int min = 0;

        final LocalDateTime dateTime = LocalDateTime.of(LocalDate.now(), LocalTime.of(hour, min));
        printAllMeetings(dateTime);
    }

    private static void printAllMeetings(LocalDateTime dt){
        LocalDateTime finalDate = dt.plusMonths(2);
        do{
            System.out.println(dt.format(DateTimeFormatter.ofPattern("d MMMM yyyy - HH:mm - назначена встреча!")));
            dt = dt.plusWeeks(1);
        } while(!finalDate.isBefore(dt));
    }
}
