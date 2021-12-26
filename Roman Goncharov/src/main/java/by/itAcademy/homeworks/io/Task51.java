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
            people[i] = new Person(RandomVariables.randomName(),RandomVariables.randomSurname(),RandomVariables.randomAge());
        }
        fileWriteInfo(people);
    }

    public static void fileWriteInfo(Object[] objects){
        File fileForWrite = new File(".//Roman Goncharov//src//main//java//by//itAcademy//homeworks//io//TextFile51.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileForWrite))) {
            for (int i = 0; i < objects.length; i++) {
                bw.write(String.valueOf(objects[i]));
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileForWrite.getName());
        } catch (IOException e) {
            System.out.println("Ошибка. Что-то не так с файлом: " + fileForWrite.getName());
        }
    }
}