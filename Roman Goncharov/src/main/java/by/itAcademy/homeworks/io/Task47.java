package by.itAcademy.homeworks.io;

/**
 * Задание 47
 * Создать файл с текстом, прочитать, подсчитать в тексте количество знаков препинания и слов.
 * Вывести результат на экран.
 */

import by.itAcademy.homeworks.regexp.Task26;
import by.itAcademy.homeworks.regexp.Task27;

import java.io.*;

public class Task47 {
    public static void main(String[] args) {
        File newFile = new File(".//Roman Goncharov//src//main//java//by//itAcademy//homeworks//io//TextFile47");
        readingAndDescriptionOfTheFile(newFile);
    }

    public static void readingAndDescriptionOfTheFile(File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String str = bufferedReader.readLine();
            int tempPunctuation = 0, tempWord = 0;
            while(str != null){
                System.out.println(str);
                tempPunctuation += Task26.findPunctuation(str);
                tempWord += Task27.findWords(str);
                str = bufferedReader.readLine();
            }
            System.out.println("Кол-во знаков препинания в тексте: "+tempPunctuation);
            System.out.println("Кол-во слов в тексте: "+tempWord);
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден.");
        } catch (IOException e){
            System.out.println("Ошибка. Что-то не так с файлом.");
        }
    }
}
