package by.itAcademy.homeworks.exceptions;

/**
 * Задание 45
 * Написать метод, который будет возбуждать исключение и обработать это исключение на уровне выше.
 * Результат работы программы вывести на экран.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {
        File newFile = new File("FileNumberOne");
        try {
            scanFile(newFile);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Обработка исключения FileNotFoundException с помощью его родителя IOException");
        }
    }

    public static void scanFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
    }
}
