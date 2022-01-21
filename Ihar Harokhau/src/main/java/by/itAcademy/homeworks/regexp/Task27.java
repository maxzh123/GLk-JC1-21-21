package by.itAcademy.homeworks.regexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 27
 *
 * Введите с клавиатуры текст.
 * Подсчитать количество слов в тексте.
 *
 */

public class Task27 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        System.out.println("Number of words in a sentence: " + countingWords(text));
    }

    public static int countingWords (String text){
        Pattern pattern = Pattern.compile("([a-zA-Zа-яА-ЯЁё]+[-]?[ ]{2,}[a-zA-Zа-яА-ЯЁё]*)|([a-zA-Zа-яА-ЯЁё]+[-]?[a-zA-Zа-яА-ЯЁё]*)");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
