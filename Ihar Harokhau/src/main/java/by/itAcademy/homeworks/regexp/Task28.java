package by.itAcademy.homeworks.regexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 28
 *
 * Ввести с клавиатуры текст.
 * Вывести на экран текст, составленный из последних букв всех слов.
 *
 */

public class Task28 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        lastLetters(text);
    }
    public static void lastLetters (String text){
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-ЯЁё]+[-]?[a-zA-Zа-яА-ЯЁё]*");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.print(matcher.group());
        }
    }
}
