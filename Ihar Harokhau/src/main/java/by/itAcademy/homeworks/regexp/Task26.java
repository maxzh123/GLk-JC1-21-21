package by.itAcademy.homeworks.regexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 26
 *
 * Введите с клавиатуры строку.
 * Найти в строке не только запятые, но и другие знаки препинания.
 * Подсчитать общее их количество.
 *
 */

public class Task26 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        System.out.println("Number of punctuation marks: " + characterSearch(text));
    }

    public static int characterSearch (String text){
        Pattern pattern = Pattern.compile("[.]{3,}|\\?+!+|!+\\?+|!+|\\?+|[.,;:\\-\"]");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
