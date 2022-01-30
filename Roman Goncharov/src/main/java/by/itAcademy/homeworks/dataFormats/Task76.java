package by.itAcademy.homeworks.dataFormats;

/**
 * Задание 76
 * Напишите программу, которая будет разбирать json файл: File76.json и выводить его на экран в текстовом виде.
 */

import by.itAcademy.homeworks.io.FileHandler;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task76 {
    public static void main(String[] args) {
        FileHandler fh = new FileHandler("dataFormats" + File.separator + "File76.json");
        File file = new File(fh.getFilePath());
        try {
            fileParsing(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileParsing(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        byte[] jsonData = Files.readAllBytes(Paths.get(file.getPath()));
        Person person = mapper.readValue(jsonData, Person.class);
        System.out.println(person);
    }
}