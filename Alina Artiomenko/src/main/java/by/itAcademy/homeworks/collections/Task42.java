package by.itAcademy.homeworks.collections;

import java.util.*;

/**Задание 42
 * 1. Ввести текст с клавиатуры
 * 2. Для текста создать Map:
 *    - где ключом - это слово
 *    - где значение – количество повторений этого слова в тексте
 */

public class Task42 {
    public static void main (String[] args){
        Scanner inputText = new Scanner(System.in);
        System.out.print("Введите текст - ");
        String text = inputText.nextLine();

        String[] arrayWorld = getArrayOfWorlds(text);
        System.out.println(Arrays.toString(arrayWorld));
        Map<String,Integer> listOfWords = getMapOfWords(arrayWorld);
        printListWords(listOfWords);

    }

    //text in an array of worlds
    public static String[] getArrayOfWorlds(String text){
        String[] arrayWorld = text.split("[[ ]*|[,]*|[\\.]*|[:]*|[/]*|[!]*|[?]*|[+]*|[-]*|[']*|[\\\"]*]+");
        return arrayWorld;
    }

    //get Map where the word it is the key, the number of repetitions is the value
    public static Map<String,Integer> getMapOfWords(String[] arr){
        Map<String, Integer> listOfWords = new LinkedHashMap<String,Integer>();
        for (String str : arr){
            int count = listOfWords.getOrDefault(str,0) + 1;
            listOfWords.put(str,count);
        }
        return listOfWords;
    }

    //print Map
    static void printListWords(Map<String,Integer> map){
        for(Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println("Количество повторений: " + entry.getKey() + " - " + entry.getValue());
        }
    }
}
