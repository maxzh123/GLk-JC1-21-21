package by.itAcademy.homeworks.types;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Задание 4
 *
 * Написать метод, который принимает на вход два целых числа, производит их суммирование и складывает результат с произведением двух этих чисел, и возвращает полученный результат.
 * Передать на вход в метод любые два числа.
 * Вывести полученный результат работы метода на экран.
 *
 */
public class Task4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        for (int i = 0; i < 1; i++){
            System.out.println((a+b)+a*b);
        }
    }
}
