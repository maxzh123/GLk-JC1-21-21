package by.itAcademy.homeworks.regexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Введите с клавиатуры строку. Напишите метод, выполняющий
 *  поиск в строке шестнадцатеричных чисел, записанных по правилам
 *  Java, с помощью регулярных выражений. Результат работы метода выведите на экран.
 **/

public class Task29 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любую стоку:");
        String s = reader.readLine();
        string(s);
    }
    private static void string(String s){
        Pattern p = Pattern.compile("0x[A-Fa-f0-9]{1,4}");
        Matcher m = p.matcher(s);
        while (m.find()){
            System.out.println(s.substring(m.start(),m.end()));
        }
    }
}

