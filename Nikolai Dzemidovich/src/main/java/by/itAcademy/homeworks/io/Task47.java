package by.itAcademy.homeworks.io;

import by.itAcademy.homeworks.regexp.Task26;
import by.itAcademy.homeworks.regexp.Task27;

public class Task47 {
    public static void main(String[] args) {
        WorkingWithAFile file = new WorkingWithAFile("TextForTask47");
        String str = file.readFile();
        System.out.println(str);
        System.out.println("Кол-во знаков препинания = " + Task26.findPunctuationSymbols(str));
        System.out.println("Кол-во слов в тексте = " + Task27.countOfWords(str));
    }
}
