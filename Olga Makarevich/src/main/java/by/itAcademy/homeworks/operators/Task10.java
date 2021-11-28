package by.itAcademy.homeworks.operators;

// Имеются два дома размерами a на b и c на d. Имеется участок размерами e на f. Проверить, помещаются ли эти дома на данном участке.
// Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner area = new Scanner(System.in);
        System.out.println("Введите длину дома 1");
        int a = area.nextInt();
        System.out.println("Введите ширину дома 1");
        int b = area.nextInt();
        System.out.println("Введите длину дома 2");
        int c = area.nextInt();
        System.out.println("Введите ширину дома 2");
        int d = area.nextInt();
        System.out.println("Введите длину участка");
        int e = area.nextInt();
        System.out.println("Введите ширину участка");
        int f = area.nextInt();
        if (a + c <=e && b + d <=f) {
            System.out.println("Дома помещаются на участке");
        } else {
            System.out.println("Дома не помещаются на участке");
        }
    }
}
