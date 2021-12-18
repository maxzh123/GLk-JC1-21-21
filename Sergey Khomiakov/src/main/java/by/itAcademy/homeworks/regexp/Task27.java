package by.itAcademy.homeworks.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**> Введите с клавиатуры текст. Подсчитать количество слов в тексте. Учесть, что
 * слова могут разделяться несколькими пробелами, в начале и конце текста также
 * могут быть пробелы, но могут и отсутствовать.
 */

public class Task27 {
    public static void main(String[] args) {
        String string = SimpleReader.readLine();
        Pattern p = Pattern.compile("[a-zA-Zа-яА-ЯёЁ]+[-]?[a-zA-Zа-яА-ЯёЁ]*");
        Matcher m = p.matcher(string);
        int count = 0;
        while (m.find()){
            count++;
        }
        System.out.println("Вы ввели следующую строку: \n"  + string);
        System.out.println("Общее количество слов в введенной строке равно " + count);
    }
}
