package by.itAcademy.homeworks.regexp;

/**
 * Задание 26
 * Введите с клавиатуры строку. Подсчитать общее кол-во знаков препинания в строке.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {
    public static void main(String[] args) {
        String str = SimpleInput.getString("Введите строку:");
        System.out.println("Кол-во знаков препинания в строке: " + findPunctuation(str));
    }

    public static int findPunctuation(String str) {
        Pattern pattern = Pattern.compile("[.]{3}|!+|\\?+|\\?+!+|!+\\?+|[.,;:\\-\"!?]");
        Matcher matcher = pattern.matcher(str);
        int temp = 0;
        while(matcher.find()){
            temp++;
        }
        return temp;
    }
}
