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
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-ЯЁё]+[-]?[a-zA-Zа-яА-ЯЁё]+"); // Находим слова.
        Matcher matcher = pattern.matcher(str);
        String lastChars = "";
        while(matcher.find()){
            String str1 = matcher.group();
            boolean bool = str1.matches("[a-zA-Zа-яА-ЯЁё]+[-]+[a-zA-Zа-яА-ЯЁё]+"); // Проверяем есть ли в слове тире
            if (bool) {
                str1 = str1.replaceAll("-",""); // Если есть, заменяем тире на пустой символ, чтобы
            }                                                   // слово с тире не принимало за два отдельных слова
            Pattern pattern1 = Pattern.compile("[a-zA-Zа-яА-ЯЁё]\\b");
            Matcher matcher1 = pattern1.matcher(str1);
            while (matcher1.find()){
                lastChars += matcher1.group();
            }
        }
        return lastChars;
    }
}
