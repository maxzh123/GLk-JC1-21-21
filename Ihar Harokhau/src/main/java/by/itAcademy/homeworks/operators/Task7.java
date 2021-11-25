package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Задание 7
 *
 * Имеется прямоугольное отверстие размерами a и b.
 * Определить, можно ли его полностью закрыть круглой картонкой радиусом r.
 *
 */

public class Task7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите значение стороны прямоугольника a.");
        int a = Integer.parseInt(reader.readLine());

        System.out.println("Введите значение стороны прямоугольника b.");
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Введите значение радиуса.");
        int r = Integer.parseInt(reader.readLine());
        reader.close();

        if (a == b){
            System.out.println("\"a\" и \"b\" не могут быть равны друг другу! Ведь у тебя прямоугольник:)");
            return;
        }

        if (r * r >= (a * a + b * b) / 4 ){
            System.out.println("Можно закрыть отверстие.");
        } else{
            System.out.println("Отверстие закрыть нельзя.");
        }
    }
}
