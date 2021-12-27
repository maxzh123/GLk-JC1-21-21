package by.itAcademy.homeworks.io;

import by.itAcademy.homeworks.regexp.Task26;
import by.itAcademy.homeworks.regexp.Task27;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/** Задание 47
 * 1) Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 * 2) Вывести результат на экран.
 */

public class Task47 {

    public static void main(String[] args) {
        File file = new File ("Sergey Khomiakov/src/main/java/by/itAcademy/homeworks/io/FileWithTextForTask47.txt");
        getNumberOfWordsAndPunctuationMarksFromFile(file);
    }

    public static void getNumberOfWordsAndPunctuationMarksFromFile(File file){
        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String tmp = reader.readLine();
            while (tmp !=null){
                text.append(tmp);
                tmp = reader.readLine();
            }
            int numberOfPunctuationMarks = Task26.countOfPunctuationMarksInText(text.toString());
            int numberOfWords = Task27.countOfWordsInText(text.toString());
            System.out.println("Количество слов в тексте: " + numberOfWords);
            System.out.println("Количество знаков препинания в тексте: " + numberOfPunctuationMarks);
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }

    }


}
