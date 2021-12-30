package by.itAcademy.homeworks.regexp;

// Введите с клавиатуры строку.
// Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String s = "Запятая ставится: между частями сложносочиненного предложения, которые соединены при помощи -соединительных (и, да(=и), ни...ни), -противительных (а, но, да(=но), однако, зато, же, а то, не), -разделительных (или, либо, ли...ли, то...то, не то...не то), -присоединительных (да, да и, тоже, также), -пояснительных (то есть, а именно) союзов.";
        System.out.println("Enter text");
        String outputLine = sc.nextLine();
        System.out.println("In the entered sentence " + countAllPunctuationMarks(outputLine) + " punctuation marks");

    }

    static int countAllPunctuationMarks (String s) {
        Pattern newPattern = Pattern.compile("[(.*),;:(!*)(/?*)(!*?*)(?*!*)\\-?]+");
        Matcher newMatcher = newPattern.matcher(s);
        int count = 0;
        while (newMatcher.find()) {
            count++;
        }
        return count;
    }
}
