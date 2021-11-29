package by.itAcademy.homeworks.operators;

/**Задание 09
 * 1.Задать три числа - день, месяц, год
 * 2.Вывод завтрешнего дня в виде DD MM YYYY
 */

import java.io.*;
public class Task9 {
    public static void main(String[] args){
        int day = 28;
        int month = 2;
        int year = 2021;

        boolean leapYear = leapYear(year);

        System.out.println(nextDate(day,month,year,leapYear));
    }


    //проверяем является ли год високосным
    public static boolean leapYear(int year){
        boolean leapYear;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
            return leapYear = true;
        } else {
            return false;
        }
    }

    //дата следующего дня
    public static String nextDate(int day, int month, int year, boolean leapYear){
        String nextDay = "";
        if (day < 30 && (month == 4 || month == 6 || month == 9 || month ==11)){
            day++;
        } else if (day == 30){
            day = 1;
            month++;
        } else if (day < 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
                month == 10 || month == 12)){
            day++;
        } else if (day > 31 && month != 12){
            day = 1;
            month++;
        } else if (day == 31 && month == 12){
            day = 1;
            month = 1;
            year++;
        } else if (month == 2 && leapYear(year) == true && day < 29){
            day++;
        } else if (month == 2 && leapYear(year) == true && day == 29){
            day = 1;
            month++;
        } else if (month == 2 && leapYear(year) != true && day < 28){
            day++;
        }else if (month == 2 && leapYear(year) != true && day == 28){
            day = 1;
            month++;
        }
        return nextDay = String.format("Завтра: " + "%02d" + "." + "%02d" + "." + "%04d",day,month,year);
    }
}
