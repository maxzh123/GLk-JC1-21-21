package by.itAcademy.homeworks.collections;

import by.itAcademy.homeworks.types.MyReadHelper;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {
        String[] array = Array(MyReadHelper.readLine("Введите строку:"));
        System.out.println(Arrays.toString(array));
        Map<String, Integer> listOfWords = splitCounter(array);
        System.out.println(listOfWords);

    }

    public static String[] Array(String string) {
        String[] array = string.split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*|[-]*|[']*|[\\\"]*]+");
        return array;
    }

    public static Map<String, Integer> splitCounter(String[] arrayOfWords) {
        Map<String, Integer> temp = new LinkedHashMap<>();

        for (String string : arrayOfWords) {
            if (!temp.containsKey(string.toLowerCase())) {
                temp.put(string.toLowerCase(), 1);
            } else {
                temp.put(string.toLowerCase(), temp.get(string) + 1);
            }

        } return temp;

    }
}
