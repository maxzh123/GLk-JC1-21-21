package by.itAcademy.homeworks.io;

/**
 * Задание 48
 * Создать файл с текстом, в котором присутствуют числа. Найти все числа, вывести на экран,
 * посчитать сумму, убрать все повторяющиеся числа и снова вывести на экран.
 */

import by.itAcademy.homeworks.collections.Task40;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task48 {
    private static final List<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler("io" + File.separator + "TextFile48.txt");
        String fileData = fileHandler.readFile();
        findNumbersInFile(fileData);
        displayingAllNumbers();
        System.out.println("\nСумма всех чисел в файле: " + sumOfNumbersInFile());
        displayingNumbersNoRepetitions();
    }

    public static void findNumbersInFile(String str) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            arrayList.add(Integer.parseInt(matcher.group()));
        }
    }

    public static int sumOfNumbersInFile() {
        ListIterator<Integer> it = arrayList.listIterator();
        Integer sum = 0;
        while (it.hasNext()) {
            Integer next = it.next();
            sum += next;
        }
        return sum;
    }

    public static void displayingAllNumbers() {
        System.out.print("Все числа в файле: ");
        for (Integer number : arrayList) {
            System.out.print(number + " ");
        }
    }

    public static void displayingNumbersNoRepetitions() {
        System.out.print("Числа в файле без повторений: ");
        for (Integer number : Task40.removeRepetitions(arrayList)) {
            System.out.print(number + " ");
        }
    }
}