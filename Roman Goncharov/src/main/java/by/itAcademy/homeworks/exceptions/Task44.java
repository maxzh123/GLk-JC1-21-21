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
        try {
            stringToUpperCase(console.nextLine());
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void stringToUpperCase (String str) throws MyException {
        if (str.equals("")) {
            throw new MyException("Вы ввели пустую строку.");
        } else System.out.println(str.toUpperCase());
    }
}
