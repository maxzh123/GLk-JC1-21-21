package by.itAcademy.homeworks.collections;

import by.itAcademy.homeworks.regexp.SimpleReader;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/** Задание 42
 * 1) Ввести текст с клавиатуры.
 * 2) Для текста создать Map, где ключом будет слово, а значение – количество повторений этого слова в тексте.
 */

public class Task42 {
    public static void main(String[] args) {
        //String line = SimpleReader.readLine();
        String staticLine = "Привет! Я - человек, который пытается что-то делать. Мир, мир, мир!";
        ArrayList<String> words = new ArrayList<>();

        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-ЯёЁ]+[-]?[a-zA-Zа-яА-ЯёЁ]*");
        Matcher matcher = pattern.matcher(staticLine);
        while (matcher.find()){
            words.add(matcher.group());
        }System.out.println(words);

        Map<String, Integer> map = new HashMap<>();

        for(String word: words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry);
        }
    }
}
