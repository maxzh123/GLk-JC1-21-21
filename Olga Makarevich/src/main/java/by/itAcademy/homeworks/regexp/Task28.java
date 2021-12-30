package by.itAcademy.homeworks.regexp;

// Введите с клавиатуры текст.
// Выведите на экран текст, составленный из последних букв всех слов из исходного текста.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        //String testString = "Бесплатный онлайн-переводчик усовершенствован";
        returnLastLetters(string);
    }


    public static void returnLastLetters(String text) {
        String ss;
        Pattern pattern = Pattern.compile("([A-Za-zА-Яа-яёЁ]{1}\\b)+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group()); // напишите здесь, пожалуйста, как вывести, чтобы было строкой?
        }
    }
}