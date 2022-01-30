package by.itAcademy.homeworks.io;

// Создать файл с текстом, в котором присутствуют числа.
// Найти все числа, вывести на экран, посчитать сумму, убрать все повторяющиеся числа и снова вывести на экран.

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task48 {
    public static void main(String[] args) throws IOException {
        File file = new File("Olga");
        boolean olga = file.createNewFile();
        System.out.println(findNumber(file));

    }

    static String findNumber(File file) throws IOException {
        return null;
    }
}
