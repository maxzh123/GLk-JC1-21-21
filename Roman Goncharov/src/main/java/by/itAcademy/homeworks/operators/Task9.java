package by.itAcademy.homeworks.operators;

/** Задание 9
 * Задать три числа – день, месяц, год. Вывести на экран в виде трех чисел дату следующего дня.
 */

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int day = console.nextInt();
        int month = console.nextInt();
        int year = console.nextInt();
        nextDay(day,month,year);
    }

    public static void nextDay(int day, int month, int year) {  // Кол-во дней в месяцах взято с календаря 2021 г.
        if (day == 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10)) {
            System.out.println("Следующий день: " + 1 + "." + ++month + "." + year);
        } else if (day == 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("Следующий день: " + 1 + "." + ++month + "." + year);
        } else if (day == 28 && month == 2) {
            System.out.println("Следующий день: " + 1 + "." + ++month + "." + year);
        } else if (day == 31 && month == 12) {
            System.out.println("Следующий день: " + 1 + "." + 1 + "." + ++year);
        } else if (day > 31 || month > 12 || (day > 28 && month == 2) || day > 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            System.out.println("Такой даты не существует");
        } else {
            System.out.println("Следующий день: " + ++day + "." + month + "." + year);
        }
    }
}
