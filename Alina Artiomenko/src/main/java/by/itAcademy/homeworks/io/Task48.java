package by.itAcademy.homeworks.io;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Задание 48
 * 1. Создать файл с текстом, в котором присутсвуют числа
 * 2. Найти все числа и вывести их на экран
 * 3. Посчитать сумму этих чисел
 * 4. Убрать повторяющиеся числа и вывести на экран
 */

public class Task48 {
    public static void main(String[] args) {
        WorkWithFileNew task48 = new WorkWithFileNew("Task48.txt");
        String text = "Что-то было сказано о числах 6787 7 7 14 14 14, \nа нужно ли учитывать знак - перед числами -2 -3?";

        task48.createNewFile();
        task48.writeToFile(text);
        task48.printTextFromFile(task48.readFile());

        ArrayList<Integer> listOfNumber = getNumbersFromText(task48.readFile()); //get array of numbers
        System.out.println("\nНайденные числа в тексте: " + listOfNumber);
        System.out.println("\nСумма числовых значений: " + getSummOfNumbers(listOfNumber));
        System.out.println("Список без дубликатов: " + removeDuplicateValues(listOfNumber));
    }


    //get ArrayList of numbers from a text
    public static ArrayList<Integer> getNumbersFromText (List<String> list){
        ArrayList<Integer> listOfNumber = new ArrayList<>();
        Pattern pattern = Pattern.compile("-?[0-9]+");
        for (String text : list){
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()){
                    listOfNumber.add(Integer.valueOf(text.substring(matcher.start(), matcher.end())));
                }
            }
        return listOfNumber;
    }

    //get the sum of the numbers
    public static int getSummOfNumbers(ArrayList<Integer> list){
        int summ = 0;
        for(Integer numbers : list){
            summ+=numbers;
        }
        return summ;
    }

    //removing duplicates
    public static ArrayList<Integer> removeDuplicateValues(ArrayList<Integer> list){
        Set<Integer> set = new LinkedHashSet<>(list);
        list = new ArrayList<>(set);
        return list;
    }
}
