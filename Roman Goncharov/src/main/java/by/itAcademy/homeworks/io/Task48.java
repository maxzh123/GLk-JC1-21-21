package by.itAcademy.homeworks.io;

/**
 * Задание 48
 * Создать файл с текстом, в котором присутствуют числа. Найти все числа, вывести на экран,
 * посчитать сумму, убрать все повторяющиеся числа и снова вывести на экран.
 */

import by.itAcademy.homeworks.collections.Task40;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task48 {
    private static List<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        File newFile = new File(".//Roman Goncharov//src//main//java//by//itAcademy//homeworks//io//TextFile48.txt");
        operationsWithNumbersInFile(newFile);
    }

    public static void operationsWithNumbersInFile(File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String str = bufferedReader.readLine();
            Pattern pattern = Pattern.compile("\\d+");
            while(str != null){
                Matcher matcher = pattern.matcher(str);
                while (matcher.find()){
                    arrayList.add(Integer.parseInt(matcher.group()));
                }
                str = bufferedReader.readLine();
            }
            sumOfNumbers();
            displayingNumbers();
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден.");
        } catch (IOException e){
            System.out.println("Ошибка. Что-то не так с файлом.");
        }
    }

    public static int sumOfNumbers(){
        ListIterator<Integer> it = arrayList.listIterator();
        Integer sum = 0;
        while(it.hasNext()){
            Integer next = it.next();
            sum += next;
        }
        return sum;
    }

    public static void displayingNumbers(){
        System.out.println("Все числа в файле:");
        for(Integer number: arrayList){
            System.out.print(number + " ");
        }
        System.out.println("\nСумма найденных в файле чисел: "+sumOfNumbers());
        System.out.println("Все числа в файле без повторений:");
        for (Integer number: Task40.removeRepetitions(arrayList)){
            System.out.print(number + " ");
        }
    }
}