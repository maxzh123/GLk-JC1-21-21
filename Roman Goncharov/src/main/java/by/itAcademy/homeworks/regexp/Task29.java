package by.itAcademy.homeworks.regexp;

/**
 * Задание 29
 * Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке шестнадцатеричных чисел,
 * с помощью регулярных выражений. Результат работы метода выведите на экран.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task29 {
    public static void main(String[] args) {
        String str = SimpleInput.getString("Введите строку:");
        findHexNumbers(str);
    }

    public static void findHexNumbers(String str) {
        Pattern pattern = Pattern.compile("0x[A-F0-9]+");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
