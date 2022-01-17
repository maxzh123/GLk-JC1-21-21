package by.itAcademy.homeworks.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** Задание 65
 * 1) От текущей даты вывести расписание всех встреч, которые происходят еженедельно в 13:00 в течение 2 месяцев.
 */

public class Task65 {
    public static void main(String[] args) {
        getTheScheduleForTheNext2Months();
    }

    public static void getTheScheduleForTheNext2Months(){
        LocalDateTime date = LocalDateTime.now();
        date = date.withHour(13);
        date = date.withMinute(0);

        LocalDateTime date2 = LocalDateTime.now();
        date2 = date2.plusMonths(2);
        while(!date.isAfter(date2)){
            System.out.println(date.format(DateTimeFormatter.ofPattern("d-MMM-yyyy HH:mm - запланированная встреча")));
            date = date.plusWeeks(1);
        }
    }
}
