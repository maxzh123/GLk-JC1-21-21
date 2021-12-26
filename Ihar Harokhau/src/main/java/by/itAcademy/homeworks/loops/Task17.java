package by.itAcademy.homeworks.loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * Задание 17
 *
 * Задать произвольное целое число и вывести его в бухгалтерском формате.
 * Начиная справа, каждые три позиции отделяются пробелом.
 */

public class Task17 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        System.out.println(new DecimalFormat("###,###").format(number));
    }
}