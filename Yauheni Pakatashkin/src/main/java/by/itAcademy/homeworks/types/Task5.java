package by.itAcademy.homeworks.types;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введите количество секунд");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number; //количество секунд

        while (true) {
            number = Integer.parseInt(reader.readLine());
            if (number >= 0) {
                break;
            } else {
                System.out.println("Введите положительное число");
            }
        }
        int week = number / 604800;
        int day = (number % 604800) / 86400;
        int hour = ((number % 604800) % 86400) / 3600;
        int minute = (((number % 604800) % 86400) % 3600) / 60;
        int second = (((number % 604800) % 86400) % 3600) % 60;

        if (week > 0) {
            System.out.print("Week: " + week+" ");
        }
        if (week > 0 && day > 0) {
            System.out.print("Day: " + day+" ");
        }
        if (hour > 0 && week > 0 && day > 0) {
            System.out.print("Hour: " + hour+" ");
        }
        if (minute > 0 && hour > 0 && week > 0 && day > 0) {
            System.out.print("Minute: " + minute+" ");
        }

        System.out.print("Second: " + second);


    }
}

