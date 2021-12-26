package by.itAcademy.homeworks.regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Задание27
 * 1.Ввод строки с клавиатуры
 * 2.Подсчитать количество слов в тексте
 * 3.Слова могут разделяться несколькими пробелами, в начале и конце текста также
 *   могут быть пробелы
 */

public class Task27 {
    public static void main(String[] args){
        String inputString = getString();
        System.out.println("Кол-во слов - " + getNumberOfWords(inputString));
    }

    public static String getString() {
        System.out.print("Введите строку: ");
        Scanner inputText = new Scanner(System.in);
        String text = inputText.nextLine();
        return text;
    }

    public static int getNumberOfWords(String text){
        Pattern pattern = Pattern.compile("[А-Яа-яЁёA-Za-z]+");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }
}
