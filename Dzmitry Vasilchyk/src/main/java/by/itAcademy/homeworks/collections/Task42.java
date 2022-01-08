package by.itAcademy.homeworks.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**Ввести текст с клавиатуры. Для текста создать Map,
 *  где ключом будет слово, а значение – количество повторений этого слова в тексте.**/

public class Task42 {
    public static void main(String[] args) throws IOException {
        System.out.println("введите текст");
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String string= reader.readLine();
        String[] massiv=makeMassiv(string);
        System.out.println(countRepeat(massiv));
    }
    public static String[] makeMassiv(String string){
        String[] massiv=string.split("[^a-zA-Zа-яА-ЯЁё0-9]+");
        for(String word:massiv){
        System.out.println(word);}
        return massiv;
    }
    public static Map<String,Integer> countRepeat(String[] word){
        Map<String, Integer> repeat=new HashMap<String,Integer>();
        for (String element:word){
            Integer count= repeat.get(element);
            if(count==null){
                count=0;
            }
            repeat.put(element,count+1);
        }
        return repeat;
    }
}
