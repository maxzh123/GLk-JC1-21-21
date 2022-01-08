package by.itAcademy.homeworks.io;

/**
 * Задание 51
 * Создать объект Person c полями name, surname, age. Сгенерировать 10 объектов класса Person со случайными полями
 * соответствующего типа. С помощью Java создать файл, в который запишется информация о этих людях.
 */

import by.itAcademy.homeworks.io.Task51Objects.Person;
import by.itAcademy.homeworks.io.Task51Objects.RandomVariables;

public class Task51 {
    public static void main(String[] args) {
        Person[] people = new Person[10];
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person(RandomVariables.randomName(), RandomVariables.randomSurname(), RandomVariables.randomAge());
        }
        FileHandlerForObjectPerson fhOne = new FileHandlerForObjectPerson("TextFile51.txt",people);
        fhOne.writeTextToFile(fhOne.textDescriptionOfPeople());
        FileHandlerForObjectPerson fhTwo = new FileHandlerForObjectPerson("BinaryFile51.bin",people);
        fhTwo.writeObjectToFile();
    }
}