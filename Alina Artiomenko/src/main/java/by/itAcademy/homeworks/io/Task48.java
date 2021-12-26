package by.itAcademy.homeworks.io;

import java.util.ArrayList;
import java.util.LinkedHashSet;
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
        WorkWithFile task48 = new WorkWithFile("Task48.txt");
        String text = "Что-то было сказано о числах 6787 7 7 14 14 14, а нужно ли учитывать знак - перед числами -2 -3?";

        task48.creatFileAndAddText(task48.getPath(), text); //create new file and write a text
        String textFromFile = task48.readFile(task48.getPath()); //read the text from the file
        System.out.println(textFromFile);
        ArrayList<Integer> listOfNumber = getNumbersFromText(textFromFile); //get array of numbers

        System.out.println("Найденные числа в тексте: " + listOfNumber);
        System.out.println("Сумма числовых значений: " + getSummOfNumbers(listOfNumber));
        System.out.println("Список без дубликатов: " + removeDuplicateValues(listOfNumber));
    }

    //get ArrayList of numbers from a text
    public static ArrayList<Integer> getNumbersFromText (String text){
        ArrayList<Integer> listOfNumber = new ArrayList<>();
        Pattern pattern = Pattern.compile("-?[0-9]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            listOfNumber.add(Integer.valueOf(text.substring(matcher.start(), matcher.end())));
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
