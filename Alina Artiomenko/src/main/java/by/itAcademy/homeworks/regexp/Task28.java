package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Задание28
 * 1. Ввод текста с клавиатуры
 * 2. Вывести текст, составленный из последних букв всех слов из исходного текста
 */

public class Task28 {
    public static void main(String[] args){
        String inputString = getString();
        System.out.println("Новая строка - " + getNewString(inputString));
    }

    public static String getString() {
        System.out.print("Введите строку: ");
        Scanner inputText = new Scanner(System.in);
        String text = inputText.nextLine();
        return text;
    }

    public static StringBuilder getNewString(String text){
        Pattern pattern = Pattern.compile("[А-Яа-яЁёA-Za-z]+");
        Matcher matcher = pattern.matcher(text);
        StringBuilder result = new StringBuilder();
        while (matcher.find()){
            result.append(text.substring(matcher.end() - 1, matcher.end()));
        }
        return result;
    }
}
