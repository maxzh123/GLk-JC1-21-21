package by.itAcademy.homeworks.regexp;

import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Задание 28
 * Введите с клавиатуры текст. Выведите на экран текст, составленный
 * из последних букв всех слов из исходного текста.
 */


public class Task28 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        string(line);
    }

    private static void string(String line) {
        Pattern pattern = Pattern.compile("([a-zа-я])\\b");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()) {
            System.out.print(matcher.group(1));
        }
    }
}
