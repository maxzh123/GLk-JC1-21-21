package by.itAcademy.homeworks.regexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Задание 26
 *
 * Введите с клавиатуры строку. Найти в строке не только запятые, но и другие знаки препинания.
 * Подсчитать общее их количество.
 */

public class Task26 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        string(line);
    }
    private static void string(String line) {
        Pattern pattern = Pattern.compile("[!.,:;?-]");
        Matcher matcher = pattern.matcher(line);
        int count = 0 ;
        while (matcher.find()){
            count++;
        }
        System.out.println(count);
    }
}
