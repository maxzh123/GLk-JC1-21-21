package by.itAcademy.homeworks.datetime;

/**
 * Задание 65
 * От текущей даты вывести расписание всех встреч, которые происходят еженедельно в 13:00 в течение 2 месяцев.
 */

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Task65 {
    public static void main(String[] args) {
        meetingScheduleDisplay(LocalTime.of(13, 0), Period.ofWeeks(1), Period.ofMonths(2));
    }

    public static void meetingScheduleDisplay(LocalTime meetingTime, Period periodicity, Period duration) {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime startDate = today;
        LocalDateTime finalDate = today.plus(duration);
        while (today.isBefore(finalDate)) {
            if (startDate.getHour() > meetingTime.getHour() && startDate.isEqual(today)) {
                System.out.println("Сегодня не успеваем на встречу.");
                today = today.plus(periodicity);
                continue;
            }
            System.out.println(today.format(DateTimeFormatter.ofPattern("dd.MM.yyyy ")) +
                    meetingTime + " Запланирована встреча");
            today = today.plus(periodicity);
        }
    }
}