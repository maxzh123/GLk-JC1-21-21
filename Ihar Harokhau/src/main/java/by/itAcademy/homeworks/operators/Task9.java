package by.itAcademy.homeworks.operators;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * Задание 9
 *
 * Задать три числа – день, месяц, год.
 * Вывести на экран в виде трех чисел дату следующего дня.
 *
 */

public class Task9 {
    public static void main(String[] args) {

       SimpleDateFormat dateFormat = new SimpleDateFormat("d MMMM yyyy");
        Calendar calendar = new GregorianCalendar(1997, 1, 23);

        calendar.roll(Calendar.DATE, +1);
        System.out.println(dateFormat.format(calendar.getTime()));
    }
}
