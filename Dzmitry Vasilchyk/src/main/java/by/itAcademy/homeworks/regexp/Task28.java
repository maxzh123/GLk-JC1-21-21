package by.itAcademy.homeworks.regexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Введите с клавиатуры текст. Выведите на экран текст,
 *  составленный из последних букв всех слов из исходного текста.
 **/

public class Task28 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любую стоку:");
        String s = reader.readLine();
        string(s);
    }
    private static void string(String s){
        Pattern p = Pattern.compile("([a-zа-я])\\b");// ищет последнюю букву (прописная буква
        Matcher m = p.matcher(s);                    //перед границей слова
        while (m.find()){
            System.out.print(m.group());
        }
    }
}
