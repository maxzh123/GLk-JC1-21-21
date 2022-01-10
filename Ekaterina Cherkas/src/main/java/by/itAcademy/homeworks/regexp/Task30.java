package by.itAcademy.homeworks.regexp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Задание 30
 * Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке всех тегов абзацев,
 * в том числе тех, у которых есть параметры, например, <p id=”p1”>, и замену их на простые теги
 * абзацев <p>. Результат работы метода выведите на экран.
 */

public class Task30 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        string(line);
    }
    private static void string(String line) {
        System.out.println(line.replaceAll("<p id=p1>", "<p>"));
        }
    }
