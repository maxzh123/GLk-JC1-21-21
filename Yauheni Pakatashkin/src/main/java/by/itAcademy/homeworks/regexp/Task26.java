package by.itAcademy.homeworks.regexp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/** Считать строку с клавиатуры
 * и посчитать в ней количество знаков препинания
 */

public class Task26 {
    public static void main(String[] args) throws Exception {
        Pattern pattern = Pattern.compile("[!.,;:?\\-]");     //создаем паттерн, где указываем знаки для поиска
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //читаем строку
        System.out.println("Введите строку");
        Matcher matcher = pattern.matcher(reader.readLine()); //создаем поисковик
        int count = 0;
        while (matcher.find()) {                             //здесь матчер ищет совпадения по шаблону, насколько я понял
            count++;
        }
        System.out.println("Количество знаков препинания = " + count);
    }
}
