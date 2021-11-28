package by.itAcademy.homeworks.operators;

// Написать метод, который выводит расписание на неделю.
// Задать на вход в метод порядковый номер дня недели и отобразить на экране то, что запланировано на этот день.

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        String Mon = "Gym";
        String Tue = "Swimmingpool";
        String Wed = "Tennis";
        String Thu = "Basketball";
        String Fri = "Soccer";
        String Sat = "Chess";
        String Sun = "Relax";
        System.out.println(Mon);
        System.out.println(Tue);
        System.out.println(Wed);
        System.out.println(Thu);
        System.out.println(Fri);
        System.out.println(Sat);
        System.out.println(Sun);
        Scanner timeTable = new Scanner(System.in);
        System.out.println("Введите порядковый номер дня недели");
        int numbDay = timeTable.nextInt();
    }

    public static int numbDay(int numbDay) {
        if (numbDay == 1) {
            System.out.println(Mon);
        } else if (numbDay == 2) {
            System.out.println(Tue);
        } else if (numbDay == 3) {
            System.out.println(Wed);
        } else if (numbDay == 4) {
            System.out.println(Thu);
        } else if (numbDay == 5) {
            System.out.println(Fri);
        } else if (numbDay == 6) {
            System.out.println(Sat);
        } else if (numbDay == 7) {
            System.out.println(Sun);
        } else {
            System.out.println("Нет такого дня недели!");
        }
    }
}
