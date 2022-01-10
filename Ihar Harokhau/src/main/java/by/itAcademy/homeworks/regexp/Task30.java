package by.itAcademy.homeworks.regexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 30
 *
 * Введите с клавиатуры строку.
 *  Напишите метод, выполняющий поиск в строке всех тегов абзацев,
 *  в том числе тех, у которых есть параметры, например, <p id=”p1”>,
 *  и замену их на простые теги абзацев <p>.
 *
 */

public class Task30 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        tagSearch(text);
    }
    public static void tagSearch (String text){
        System.out.println(text.replaceAll("<p id=p1>", "<p>"));
    }
}
