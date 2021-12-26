package by.itAcademy.homeworks.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Введите с клавиатуры строку. Найти в строке не только запятые, но и другие
 * знаки препинания. Подсчитать общее их количество.
 */

public class Task26 {
    public static void main(String[] args) {
        String string = SimpleReader.readLine();
        Pattern p = Pattern.compile("[.]{3,}|[!]+[?]+|[?]+[!]+|[!]+|[?]+|[.,;:\"'-]");
        Matcher m = p.matcher(string);
        int count = 0;
        while (m.find()){
            count++;
        }
        System.out.println("Вы ввели следующую строку: \n"  + string);
        System.out.println("Общее количество знаков препинания в введенной строке равно " + count);

    }
}
