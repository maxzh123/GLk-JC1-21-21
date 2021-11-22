package by.itAcademy.homeworks.operators;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**Задание09:
 вывести на экран дату следующего дня
 */

public class Task9 {
    public static void main(String[] args) {
       Scanner a = new Scanner(System.in);
        System.out.println("Введите день:");
        int D = a.nextInt();

        Scanner b = new Scanner(System.in);
        System.out.println("Введите месяц:");
        int M = b.nextInt() - 1;

        Scanner r = new Scanner(System.in);
        System.out.println("Введите год:");
        int Y = r.nextInt();

       Calendar calendar = new GregorianCalendar(Y,M,D);
        calendar.add(Calendar.DAY_OF_YEAR, +1);
        System.out.println("Следующий день: " + calendar.get(Calendar.DAY_OF_MONTH)+"."+
                (calendar.get(Calendar.MONTH) + 1) +"." + (calendar.get(Calendar.YEAR)));
                                }
    }


