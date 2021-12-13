package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Задание 26
 * 1. Ввод строки с клавиатуры
 * 2. Подситать кол-во знаков препинания
 */

public class Task26 {
    public static void main(String[] args) {

        String inputString = getString();
        System.out.println("Кол-во знаков преминания - " + getNumberOfCharacters(inputString));
    }

    public static String getString() {
        System.out.print("Введите строку: ");
        Scanner inputText = new Scanner(System.in);
        String text = inputText.nextLine();
        return text;
    }

    public static int getNumberOfCharacters(String text){
        Pattern pattern = Pattern.compile("[\\p{Punct}]");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }
}


