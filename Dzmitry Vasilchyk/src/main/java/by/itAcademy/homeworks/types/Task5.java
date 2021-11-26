package by.itAcademy.homeworks.types;

import java.util.Scanner;
/**Задание05:
 заданный промежуток времени в секундах
 вывести на экран в виде часов, минут, секунд, суток и недель
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество секунд:");
        int x = in.nextInt();
        countSek(x);
    }
        private static void countSek(int x) {
        int s = x % 60;
        int min = x / 60;
        int m = min % 60;
        int hour = min / 60;
        int h = hour % 24;
        int day = hour / 24;
        int d = day % 7;
        int w = day / 7;
        System.out.println(x + " секунд составит:" + "\n" + s + " second" + "\n" + m + " minutes" + "\n" + h + " hour" + "\n"
                + d + " day" + "\n" + w + " week");}
    }
