package by.itAcademy.homeworks.regexp;

import by.itAcademy.homeworks.types.MyReadHelper;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * > Введите с клавиатуры текст. Подсчитать количество слов в тексте. Учесть, что
 * > слова могут разделяться несколькими пробелами, в начале и конце текста также
 * > могут быть пробелы, но могут и отсутствовать.
 */

public class Task27 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        System.out.println(countOfWords(str));

        //Будет вопрос на лекции.
        //String str2 = MyReadHelper.readLine("Текст :");
        //System.out.println(countOfWords(str2));

    }

    public static int countOfWords(String string) {

        int count = 0;

        Pattern p1 = Pattern.compile("[А-Яа-яЁёA-Za-z]+");
        Matcher m1 = p1.matcher(string);

        while (m1.find()) {
               count++;
        }
        return count;
    }
}
