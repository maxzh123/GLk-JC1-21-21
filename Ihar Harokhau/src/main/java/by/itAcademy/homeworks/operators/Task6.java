package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Задание 6
 *
 * Создайте метод с одним целочисленным параметром.
 * Метод должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение.
 *
 */
public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        reader.close();
        System.out.println(check(number));
    }
    public static boolean check (int test){
        if (test % 10 == 7){
            return true;
        } else {
            return false;
        }
    }
}
