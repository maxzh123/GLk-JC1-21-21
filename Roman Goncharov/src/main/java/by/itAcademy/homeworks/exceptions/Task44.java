package by.itAcademy.homeworks.exceptions;

/**
 * Задание 44
 * Написать собственное исключение от Exception. Сгенерировать код, который будет выбрасывать его и обрабатывать.
 * Результат работы программы вывести на экран.
 */

import java.util.Scanner;

public class Task44 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        stringToUpperCase(console.nextLine());
    }

    public static void stringToUpperCase (String str) {
        if (str.equals("")) {
            try {
                throw new MyException("Вы ввели пустую строку.");
            } catch (MyException e) {
                e.printStackTrace();
            }
        } else System.out.println(str.toUpperCase());
    }
}
