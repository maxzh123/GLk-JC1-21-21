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
        ReadWriteFileAssistant task47 = new ReadWriteFileAssistant("FileWithTextForTask47.txt");
        String textForExample = "Класс ObjectInputStream отвечает за обратный процесс - чтение ранее сериализованных " +
                "данных из потока. В конструкторе он принимает ссылку на поток ввода:";
        task47.writeTextInFile(textForExample);
        String text = task47.readTextFromFile();

        //берем метод подсчета знаков препинания в тексте из задания 26
        int numberOfPunctuationMarks = Task26.countOfPunctuationMarksInText(text);
        //берем метод подсчета количества слов в тексте из задания 27
        int numberOfWords = Task27.countOfWordsInText(text);

        System.out.println("Количество слов в тексте: " + numberOfWords);
        System.out.println("Количество знаков препинания в тексте: " + numberOfPunctuationMarks);

    }
}
