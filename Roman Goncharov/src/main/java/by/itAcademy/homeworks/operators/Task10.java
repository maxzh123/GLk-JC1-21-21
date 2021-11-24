package by.itAcademy.homeworks.operators;

import java.util.Scanner;

// Задание № 10
// Проверить можно ли разместить 2 дома размерами a*b и с*d на участке e*f. Расположение сторон домов параллельно
// расположению сторон участка.

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
        if (e >= a && e >=c && f >= b+d) {
            System.out.println("На участке размерами " + e + "*" + f + " можно разместить 2 дома размерами " +
                    a + "*" + b + " и " + c + "*" + d);
        } else if (e >= a && e >= d && f >= b+c) {
            System.out.println("На участке размерами " + e + "*" + f + " можно разместить 2 дома размерами " +
                    a + "*" + b + " и " + c + "*" + d);
        } else if (e >= b && e >= c && f >= a + d) {
            System.out.println("На участке размерами " + e + "*" + f + " можно разместить 2 дома размерами " +
                    a + "*" + b + " и " + c + "*" + d);
        } else if (e >= b && e >= d && f >= a+c) {
            System.out.println("На участке размерами " + e + "*" + f + " можно разместить 2 дома размерами " +
                    a + "*" + b + " и " + c + "*" + d);
        } else if (f >= a && f >=c && e >= b+d) {
            System.out.println("На участке размерами " + e + "*" + f + " можно разместить 2 дома размерами " +
                    a + "*" + b + " и " + c + "*" + d);
        } else if (f >= a && f >= d && e >= b+c) {
            System.out.println("На участке размерами " + e + "*" + f + " можно разместить 2 дома размерами " +
                    a + "*" + b + " и " + c + "*" + d);
        } else if (f >= b && f >= c && e >= a + d) {
            System.out.println("На участке размерами " + e + "*" + f + " можно разместить 2 дома размерами " +
                    a + "*" + b + " и " + c + "*" + d);
        } else if (f >= b && f >= d && e >= a+c) {
            System.out.println("На участке размерами " + e + "*" + f + " можно разместить 2 дома размерами " +
                    a + "*" + b + " и " + c + "*" + d);
        } else {
            System.out.println("На участке размерами " + e + "*" + f + " нельзя разместить 2 дома размерами " +
                    a + "*" + b + " и " + c + "*" + d);
        }
    }
}
