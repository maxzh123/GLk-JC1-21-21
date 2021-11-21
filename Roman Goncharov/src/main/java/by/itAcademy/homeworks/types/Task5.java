package by.itAcademy.homeworks.types;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
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
