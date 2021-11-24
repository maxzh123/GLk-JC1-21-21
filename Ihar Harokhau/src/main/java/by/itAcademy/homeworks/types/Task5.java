package by.itAcademy.homeworks.types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Задание 5
 *
 * Задать промежуток времени в секундах в виде переменной.
 * Следует вывести его на экран в виде часов, минут, секунд, суток и недель.
 */

public class Task5 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int time = Integer.parseInt(reader.readLine());
        reader.close();

        double weeks, days, hours, minutes, seconds;

        weeks = (double) time / 604800;
        days = (weeks - (int) weeks) * 7;
        hours = (days - (int) days) * 24;
        minutes = (hours - (int) hours) * 60;
        seconds = (minutes - (int) minutes) * 60;
        System.out.println((int)weeks + " Недель " + (int)days + " Дней " + (int)hours + " Часов " +
                (int)minutes + " Минут " + (int)seconds + " Секунд");
    }
}
