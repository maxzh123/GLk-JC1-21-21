package by.itAcademy.homeworks.regexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Введите с клавиатуры текст. Подсчитать количество слов в тексте.
 *  Учесть, что слова могут разделяться несколькими пробелами, в
 *  начале и конце текста также могут быть пробелы, но могут и отсутствовать.
 **/

public class Task27 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любую стоку:");
        String s = reader.readLine();
        string(s);
    }
    private static void string(String s){
        Pattern p = Pattern.compile("\\b");// границы слова - их две
        Matcher m = p.matcher(s);
        int count = 0;
        while (m.find()){
            count++;
        }
        System.out.println(count/2);
    }
}
