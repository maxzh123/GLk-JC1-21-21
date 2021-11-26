package by.itAcademy.homeworks.operators;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Task9 {
    public static void main(String[] args) {
        int months;
        int year;
        GregorianCalendar gcalendar = new GregorianCalendar();
        System.out.print("Дата: ");
        System.out.print(" " + (gcalendar.get(Calendar.DATE) + 1) + ".");
        System.out.print(gcalendar.get(Calendar.MONTH) + ".");
        System.out.println(gcalendar.get(Calendar.YEAR));
    }
}
