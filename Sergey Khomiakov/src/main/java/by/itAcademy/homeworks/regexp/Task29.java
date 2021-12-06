package by.itAcademy.homeworks.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке
* шестнадцатеричных чисел, записанных по правилам Java, с помощью регулярных
* выражений. Результат работы метода выведите на экран.
 */

public class Task29 {
    public static void main(String[] args) {
        String string = SimpleReader.readLine();
        Pattern p = Pattern.compile("0[xX][0-9a-fA-F]+");
        Matcher m = p.matcher(string);
        while (m.find()){
                System.out.println(m.group());
        }

    }
}
