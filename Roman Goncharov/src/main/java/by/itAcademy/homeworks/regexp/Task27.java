package by.itAcademy.homeworks.regexp;

/**
 * Задание 27
 * Введите с клавиатуры строку. Подсчитать общее кол-во слов в строке. Учитывать, что слово может быть разделено
 * несколькими пробелами.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    public static void main(String[] args) {
        String str = SimpleInput.getString("Введите строку:");
        System.out.println("Кол-во слов в строке: " + findWords(str));
    }

    public static int findWords(String str) {
        Pattern pattern = Pattern.compile("([a-zA-Zа-яА-ЯЁё]+[-]?[ ]{2,}[a-zA-Zа-яА-ЯЁё]*)|([a-zA-Zа-яА-ЯЁё]+[-]?[a-zA-Zа-яА-ЯЁё]*)");
        Matcher matcher = pattern.matcher(str);
        int temp = 0;
        while(matcher.find()){
            temp++;
        }
        return temp;
    }
}
