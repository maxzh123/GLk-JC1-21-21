package by.itAcademy.homeworks.regexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 29
 *
 * Введите с клавиатуры строку.
 * Напишите метод, выполняющий поиск в строке шестнадцатеричных чисел,
 * записанных по правилам Java, с помощью регулярных выражений.
 *
 */

public class Task29 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        searchForHexadecimalNumbers(text);
    }

    public static void searchForHexadecimalNumbers (String text){
        Pattern pattern = Pattern.compile("0x([A-F0-9]{2})+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
