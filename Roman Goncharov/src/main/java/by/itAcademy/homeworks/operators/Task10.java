package by.itAcademy.homeworks.operators;

/** Задание 10
 * Проверить можно ли разместить 2 дома размерами a*b и с*d на участке e*f. Расположение сторон домов параллельно
 * расположению сторон участка.
 */

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер a");
        int a = console.nextInt();
        System.out.println("Введите размер b");
        int b = console.nextInt();
        System.out.println("Введите размер c");
        int c = console.nextInt();
        System.out.println("Введите размер d");
        int d = console.nextInt();
        System.out.println("Введите размер e");
        int e = console.nextInt();
        System.out.println("Введите размер f");
        int f = console.nextInt();
        checkingAreas(a,b,c,d,e,f);
    }

    public static void checkingAreas (int a, int b, int c, int d, int e, int f) {
        if (e >= a && e >=c && f >= b+d || e >= a && e >= d && f >= b+c || e >= b && e >= c && f >= a + d
        || e >= b && e >= d && f >= a+c || f >= a && f >=c && e >= b+d || f >= a && f >= d && e >= b+c ||
        f >= b && f >= c && e >= a + d || f >= b && f >= d && e >= a+c) {
            System.out.println("На участке размерами " + e + "*" + f + " можно разместить 2 дома размерами " +
                    a + "*" + b + " и " + c + "*" + d);
        } else {
            System.out.println("На участке размерами " + e + "*" + f + " нельзя разместить 2 дома размерами " +
                    a + "*" + b + " и " + c + "*" + d);
        }
    }
}
