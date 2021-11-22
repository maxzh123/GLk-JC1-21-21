package by.itAcademy.homeworks.operators;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task9 {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2018, Calendar.SEPTEMBER, 2);
        calendar.roll(Calendar.DATE, +1);
        System.out.println(calendar.getTime());
    }
}
