package by.itAcademy.homeworks.operators;

import java.util.Scanner;

// Работает, но не уверен, что код корректен.
public class Task9 {
    public static void data() {
        Scanner scn = new Scanner(System.in);
        System.out.println("День: ");
        int day = scn.nextInt();
        System.out.println("Месяц: ");
        int month = scn.nextInt();
        System.out.println("Год: ");
        int year = scn.nextInt();
        if (day > 31 || day < 1 || month > 12 || month < 1 || year < 0) {
            System.out.println("Неправильная дата");

        } else if (day == 31 && month == 1 || day == 28 && month == 2 || day == 31 && month == 3 || day == 30 && month == 4 || day == 31 && month == 5 || day == 30 && month == 6 || day == 31 && month == 7 || day == 31 && month == 8 || day == 30 && month == 9 || day == 31 && month == 10 || day == 30 && month == 11) {
            day = 1;
            month++;
            System.out.print("Завтра будет: " + day + "." + month + "." + year);

        } else if (day < 31) {
            System.out.print("Завтра будет: " + (day + 1) + "." + month + "." + year);

        } else if (month == 12) {
            day = 1;
            month = 1;
            year++;
            System.out.println("Завтра будет: " + day + "." + month + "." + year);
        }
    }

    public static void main(String[] args) {
        data();
    }
}
