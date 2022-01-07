package by.itAcademy.homeworks.io;

import by.itAcademy.homeworks.collections.Task40;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**> Задание 48
 * 1) Создать файл с текстом, в котором присутствуют числа.
 * 2) Найти все числа,вывести на экран, посчитать сумму.
 * 3) Убрать все повторяющиеся числа и снова вывести на экран.
 */

public class Task48 {
    private static List<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        ReadWriteFileAssistant task48 = new ReadWriteFileAssistant("FileWithNumbersForTask48.txt");
        String textForWriting = "По умолчанию сериализуются все  3 переменные объекта. Однако," +
                " возможно, мы хотим, 1 чтобы некоторые 2 поля были исключены из сериализации. Для этого они 10 " +
                "3 должны быть объявлены с 2 модификатором transient 10.";
        task48.writeTextInFile(textForWriting);

        String text = task48.readTextFromFile();
        getNumbersFromText(text);

        System.out.println("Список чисел из текста:\n" + arrayList);
        System.out.println("Сумма значений:\n" + getSum(arrayList));
        System.out.println("Список чисел из текста без повторов:\n" + Task40.helperForRemoveRepeats(arrayList));
    }

    public static void getNumbersFromText(String text){
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                arrayList.add(Integer.parseInt(matcher.group()));}
     }

    public static Integer getSum(Collection<Integer> collection){
        int sum = 0;
        for(Integer element: collection){
            sum+=element;
        }
        return sum;
    }
}
