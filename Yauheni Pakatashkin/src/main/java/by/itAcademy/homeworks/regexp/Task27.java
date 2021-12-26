package by.itAcademy.homeworks.regexp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Task27 {
    public static void main(String[] args) {
        String str = "  Это   строка  для проверки djn        сссс ";
        System.out.println("Количество слов: "+wordsCount(str));
    }



    public static int wordsCount(String y){
        String s1=y.trim();
        ArrayList <String> strings = new ArrayList<String>();
        for(String s: s1.split("[^a-zA-Zа-яА-Я]+")){
            strings.add(s);
        }

        for (int i=0; i<strings.size();i++){
            if(strings.get(i).equals(" ")){
                strings.remove(i);
            }
        }
        return strings.size();
    }
}
