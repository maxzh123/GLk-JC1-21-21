package by.itAcademy.homeworks.regexp;

/**
 * Задание 28
 * Введите с клавиатуры строку. Вывести на экран текст, составленный из последних букв всех слов из исходной строки.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {
    public static void main(String[] args) {
        String str = SimpleInput.getString("Введите строку:");
        System.out.println("Последние буквы слов строки: " + findTheLastLetters(str));
    }

    public static String findTheLastLetters(String str) {
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-ЯЁё]+[-]?[a-zA-Zа-яА-ЯЁё]*");
        Matcher matcher = pattern.matcher(str);
        String lastChars = "";
        while(matcher.find()){
            String str1 = matcher.group();
            Pattern pattern1 = Pattern.compile("\\S\\b");
            Matcher matcher1 = pattern1.matcher(str1);
            while (matcher1.find()){
                lastChars += matcher1.group() + " ";
            }
        }
        return lastChars;
    }
}
