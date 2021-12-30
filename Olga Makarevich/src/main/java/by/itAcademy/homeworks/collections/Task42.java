package by.itAcademy.homeworks.collections;

//Ввести текст с клавиатуры. Для текста создать Map, где ключом будет слово,
//а значение – количество повторений этого слова в тексте.

import java.sql.Array;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class Task42 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите текст");
        String enter = scr.nextLine();
        Map<String, Integer> text = new HashMap<>();
        System.out.println(text.put(enter,count(enter)));
        System.out.println(text.values());
        System.out.println(text.keySet());
    }

    public static int count(String txt) {
        String[] txt1 = new String[]{txt};
        int count = 0;
            for (int i = 0; i < txt1.length; i++) {
                if (txt1[count] == txt1[i]) {
                    count++;
                } else {
                    count = 0;
                }
            }
        return count;
    }
}
