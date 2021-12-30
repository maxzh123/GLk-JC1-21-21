package by.itAcademy.homeworks.regexp;

// Введите с клавиатуры текст. Подсчитать количество слов в тексте.
// Учесть, что слова могут разделяться несколькими пробелами, в начале и конце текста также
// могут быть пробелы, но могут и отсутствовать.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        System.out.println("Количество слов в введенном тексте: " + countNumberOfWords(text));
    }

    static int countNumberOfWords (String someText) {
        int count = 0;
        Pattern pattern = Pattern.compile("([a-zA-Zа-яА-ЯёЁ][ ])|([ ][a-zA-Zа-яА-ЯёЁ])");
        Matcher matcher = pattern.matcher(someText);
        while (matcher.find()) {
            count++;
        }
        return count;
    }
}
