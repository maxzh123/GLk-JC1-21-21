package by.itAcademy.homeworks.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Введите с клавиатуры текст. Подсчитать количество слов в тексте.
 *  Учесть, что слова могут разделяться несколькими пробелами, в
 *  начале и конце текста также могут быть пробелы, но могут и отсутствовать.
 **/

public class Task27 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Введите любую стоку:");
//        String s = reader.readLine();
//        string(s);
//    }
    public static int string(String s){
        Pattern p = Pattern.compile("[А-Яа-яЁёA-Za-z]+");
        Matcher m = p.matcher(s);
        int count = 0;
        while (m.find()){
            count++;
        }
        return count;
    }
}
