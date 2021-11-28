package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * Задание 10
 *
 * Имеются два дома размерами a на b и c на d.
 * Имеется участок размерами e на f.
 * Стороны домов – параллельны сторонам участка, в остальном размещение может быть любым.
 * Проверить, помещаются ли эти дома на данном участке.
 *
 */
public class Task10 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите значение 1 дома стороны a:");
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Введите значение 1 дома стороны b:");
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Введите значение 2 дома стороны c:");
        int c = Integer.parseInt(reader.readLine());

        System.out.println("Введите значение 2 дома стороны d:");
        int d = Integer.parseInt(reader.readLine());

        System.out.println("Введите значение участка стороны e:");
        int e = Integer.parseInt(reader.readLine());

        System.out.println("Введите значение участка стороны f:");
        int f = Integer.parseInt(reader.readLine());

        if (e * f > (a * b) + (c * d)){
            System.out.println("Дома помещаются на данном участке.");
        } else {
            System.out.println("Дома не помещаются на данном участке.");
        }
    }
}
