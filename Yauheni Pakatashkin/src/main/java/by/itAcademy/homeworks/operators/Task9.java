package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task9 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите день");
        int day = Integer.parseInt(reader.readLine());
        System.out.println("Введите месяц");
        int month = Integer.parseInt(reader.readLine());
        System.out.println("Введите год");
        int year = Integer.parseInt(reader.readLine());
        reader.close();
        System.out.println(day + "." + month + "." + year);


        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
            if (day == 31) {
                day = 1;
                month++;
            } else day++;
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 30) {
                day = 1;
                month++;
            } else day++;
        }else if (month == 12) {
            if (day == 31) {
                day = 1;
                month = 1;
                year++;
            } else day++;
        }else if (month == 2) {
            if (day == 29 && checkYear(year)) {
                day = 1;
                month++;
            } else if (day == 28 && checkYear(year)) {
                day++;
            } else if (day == 28) {
                day = 1;
                month++;
            } else day++;
        }
        System.out.println(day + "." + month + "." + year);

    }

    public static boolean checkYear(int year) {
        return year % 100 == 0 && year % 400 == 0 || year % 4 == 0 && year % 100 > 0;

    }


}
