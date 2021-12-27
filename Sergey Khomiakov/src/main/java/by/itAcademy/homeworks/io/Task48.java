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
        File file = new File("Sergey Khomiakov/src/main/java/by/itAcademy/homeworks/io/FileWithNumbersForTask48.txt");
        getNumberFromTextDoSumAndRemoveAllRepeats(file);
    }

    public static void getNumberFromTextDoSumAndRemoveAllRepeats(File file){
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String text = reader.readLine();
            Pattern pattern = Pattern.compile("[0-9]+");
            while (text!=null){
                Matcher matcher = pattern.matcher(text);
                while (matcher.find()) {
                    arrayList.add(Integer.parseInt(matcher.group()));}
                text = reader.readLine();
            }
            System.out.println("Список чисел из текста:\n" + arrayList);
            System.out.println("Сумма значений:\n" + getSum(arrayList));
            System.out.println("Список чисел из текста без повторов:\n" + Task40.helperForDeleteRepeats(arrayList));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Integer getSum(Collection<Integer> collection){
        int sum = 0;
        for(Integer element: collection){
            sum+=element;
        }
        return sum;
    }
}
