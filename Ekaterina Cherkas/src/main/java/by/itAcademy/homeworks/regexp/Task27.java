package by.itAcademy.homeworks.regexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Задание 27
 * Введите с клавиатуры текст. Подсчитать количество слов в тексте. Учесть, что слова могут разделяться
 * несколькими пробелами, в начале и конце текста также могут быть пробелы, но могут и отсутствовать.
 */

public class Task27 {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println(findWords(line));
    }

    private static int findWords(String line) {
        Pattern pattern = Pattern.compile("[А-Яа-яЁёA-Za-z]+");
        Matcher matcher = pattern.matcher(line);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}