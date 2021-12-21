package by.itAcademy.homeworks.collections;

/**
 * Задание 42
 * Ввести текст с клавиатуры. Для текста создать Map, где ключом будет слово, а значение – количество повторений
 * этого слова в тексте.
 */

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task42 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        Map<String,Integer> newMap = getMapFromList(convertTextToAnArrayOfWords(text));
        System.out.println(newMap);
    }

    public static List<String> convertTextToAnArrayOfWords(String text){
        List<String> arrayListWords = new ArrayList<>();
        String word;
        Pattern pattern = Pattern.compile("[a-zA-Zа-яА-ЯЁё]+[-]?[a-zA-Zа-яА-ЯЁё]*");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            word = matcher.group();
            arrayListWords.add(word.toLowerCase());
        }
        return arrayListWords;
    }

    public static Map<String,Integer> getMapFromList(List<String> arrayList){
        Map<String,Integer> map = new LinkedHashMap<>();
        String word;
        int number;
        ListIterator<String> it = arrayList.listIterator();
        while(it.hasNext()){
            word = it.next();
            number = Collections.frequency(arrayList,word);
            map.put(word, number);
        }
        return map;
    }
}

