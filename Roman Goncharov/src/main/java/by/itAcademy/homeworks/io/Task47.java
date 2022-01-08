package by.itAcademy.homeworks.io;

/**
 * Задание 47
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 * Вывести результат на экран.
 */

import by.itAcademy.homeworks.regexp.Task26;
import by.itAcademy.homeworks.regexp.Task27;

import java.io.File;

public class Task47 {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler("io"+ File.separator+"TextFile47.txt");
        String fileData = fileHandler.readFile();
        System.out.println("Количество слов в файле: " + findWordsInFile(fileData));
        System.out.println("Количество знаков препинания в файле: " + findPunctuationInFile(fileData));
    }

    public static int findWordsInFile(String str) {
        return Task27.findWords(str);
    }

    public static int findPunctuationInFile(String str) {
        return Task26.findPunctuation(str);
    }
}
