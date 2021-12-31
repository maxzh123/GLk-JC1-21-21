package by.itAcademy.homeworks.io;

/**
 * Задание 51
 * Создать объект Person c полями name, surname, age. Сгенерировать 10 объектов класса Person со случайными полями
 * соответствующего типа. С помощью Java создать файл, в который запишется информация о этих людях.
 */

import by.itAcademy.homeworks.io.Task51Objects.Person;
import by.itAcademy.homeworks.io.Task51Objects.RandomVariables;

import java.io.*;

public class Task51 {
    public static void main(String[] args) {
        Person[] people = new Person[10];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(RandomVariables.randomName(), RandomVariables.randomSurname(), RandomVariables.randomAge());
        }
        FileHandler fileHandlerText = new FileHandler("TextFile51.txt");
        fileHandlerText.fileWrite(textDescriptionOfObjects(people));
        FileHandler fileHandlerBinary = new FileHandler("BinaryFile51.bin");
        writeObjectToFile(people, fileHandlerBinary.getFilePath());
    }

    public static String textDescriptionOfObjects(Object[] objects) {
        StringBuilder listString = new StringBuilder();
        for (Object obj : objects) {
            listString.append(obj).append("\n");
        }
        return listString.toString();
    }

    public static void writeObjectToFile(Object[] objects, String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(objects);
            System.out.println("Запись в файл " + fileName + " произведена успешно.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка. Что-то не так с файлом.");
        }
    }
}