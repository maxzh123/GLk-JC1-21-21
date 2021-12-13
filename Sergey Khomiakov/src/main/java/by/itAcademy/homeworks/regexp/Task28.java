package by.itAcademy.homeworks.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Введите с клавиатуры текст. Выведите на экран текст, составленный из
 * последних букв всех слов из исходного текста.
 */

public class Task28 {
    public static void main(String[] args) {
        String string = SimpleReader.readLine();
        Pattern p = Pattern.compile("[a-zA-Zа-яА-ЯёЁ]\\b");
        Matcher m = p.matcher(string);
        String line = "";
        while(m.find()){
            line += m.group();
        }
        System.out.println("Вы ввели следующую строку: \n"  + string);
        System.out.println("Новая строка, составленная из последних букв всех слов предыдущей строки равна: " + line);
    }
}
