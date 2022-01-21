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
        System.out.println("The last letters of the words in the string: " + lastLetters(text));
    }
    public static String lastLetters (String text){
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-ЯЁё]+[-]?[a-zA-Zа-яА-ЯЁё]*");
        Matcher matcher = pattern.matcher(text);
        String lastChars = "";
        while (matcher.find()){
            String str = matcher.group();
            boolean bool = str.matches("[a-zA-Zа-яА-ЯЁё]+-[a-zA-Zа-яА-ЯЁё]+");
            if (bool) {
                str = str.replaceAll("-","");
            }
            Pattern patt = Pattern.compile("[a-zA-Zа-яА-ЯЁё]\\b");
            Matcher match = patt.matcher(str);
            while (match.find()){
                lastChars += match.group();
            }
        }
        return lastChars;
    }
}
