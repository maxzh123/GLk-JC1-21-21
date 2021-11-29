package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Задание 8
 *
 * Задать целое число в виде переменной, это число – сумма денег в рублях.
 *
 */

public class Task8 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(reader.readLine());
        reader.close();

        switch (sum % 10){
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(sum + " Рублей.");
                break;
            case 1:
                System.out.println(sum + " Рубль.");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(sum + " Рубля.");
        }
    }
}
