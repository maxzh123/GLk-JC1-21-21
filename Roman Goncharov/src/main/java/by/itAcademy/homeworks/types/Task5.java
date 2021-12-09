package by.itAcademy.homeworks.types;

/** Задание 5
 * Задать промежуток времени в секундах в виде переменной.
 * Следует вывести его на экран в виде часов минут и секунд, суток и недель.
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int timeInSeconds = console.nextInt();
        getTime(timeInSeconds);
    }

    public static void getTime(int a) {
        int week,day,hour,min,sec;
        week = a / 604800;
        System.out.println(week + " weeks");
        day = (a - 604800 * week) / 86400;
        System.out.println(day + " days");
        hour = (a - 604800 * week - 86400 * day) / 3600;
        System.out.println(hour + " hours");
        min = (a - 604800 * week - 86400 * day - 3600 * hour) / 60;
        System.out.println(min + " minutes");
        sec = (a - 604800 * week - 86400 * day - 3600 * hour - 60 * min);
        System.out.println(sec + " seconds");
    }
}
