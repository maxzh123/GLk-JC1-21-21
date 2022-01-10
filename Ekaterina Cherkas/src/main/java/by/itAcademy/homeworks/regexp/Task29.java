package by.itAcademy.homeworks.regexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Задание 29
 * Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке шестнадцатеричных чисел, записанных
 * по правилам Java, с помощью регулярных выражений. Результат работы метода выведите на экран.
 */

public class Task29 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        string(line);
    }
    private static void string(String line) {
        Pattern pattern = Pattern.compile("0x([A-Fa-f0-9]{1,4})");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
