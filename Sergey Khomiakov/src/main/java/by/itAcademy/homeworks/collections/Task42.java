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
        System.out.println("Введите текст");
        String line = SimpleReader.readLine();
        Map<String, Integer> map = getMapForDividedString(getEachWordFromString(line));

        map.entrySet().forEach(System.out::println);
    }

    // делаем коллекцию Map из массива, полученного из метода getEachWordFromString
    public static Map<String, Integer> getMapForDividedString(List<String> words){
        Map<String, Integer> map = new HashMap<>();
        for(String word: words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
               map.put(word, map.get(word) + 1);
            }
        } return map;
    }

    // разделяем строку на массив слов и заносив в коллекцию ArrayList (промежуточный шаг)
    public static List<String> getEachWordFromString(String line){
        ArrayList<String> words = new ArrayList<>();

        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-ЯёЁ]+[-]?[a-zA-Zа-яА-ЯёЁ]*");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()){
            words.add(matcher.group());
        } return words;
    }
}
