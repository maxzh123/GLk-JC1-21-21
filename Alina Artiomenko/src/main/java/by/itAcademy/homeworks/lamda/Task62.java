package by.itAcademy.homeworks.lamda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**Задание 62
 * 1. Создать класс Person с полями name, surname, age
 * 2. Создать группу из 100 человек от 15 до 30 лет.
 * 3. Написать ОДНУ НЕПРЕРЫВНУЮ цепочку stream, которая:
 *    - выбирает объекты, возраст которых меньше 21;
 *    - распечатывает их на экран;
 *    - сортирует по фамилии, а потом по имени (использовать thenComparing у объекта Comparator);
 *    - берет 4 первых объекта;
 *    - формирует коллекцию из фамилий объектов;
 *    - агрегирует все в коллекцию.
 */

public class Task62 {
    static final String path = "Alina Artiomenko" + System.getProperty("file.separator") + "src" + System.getProperty("file.separator") +
            "main" + System.getProperty("file.separator") + "java" + System.getProperty("file.separator") + "by" + System.getProperty("file.separator") +
            "itAcademy" + System.getProperty("file.separator") + "homeworks" + System.getProperty("file.separator") + "lamda" + System.getProperty("file.separator");

    public static void main(String[] args) {
        System.out.println(path);
        int numberOfPerson = 100;
        int minAge = 15;
        int maxAge = 30;

        List<String> listOfName = readFromFile("Name.txt");
        List<String> listOfSurname = readFromFile("Surname.txt");
        List<Integer> listOfAge = fillListOfAge(numberOfPerson, minAge, maxAge);

        System.out.println(Arrays.asList(listOfName));
        System.out.println(Arrays.asList(listOfSurname));
        System.out.println(Arrays.asList(listOfAge));

    }

    static List fillListOfAge (int numberOfPerson, int min, int max){
        List<Integer> listOfNumber = new ArrayList<>();
        int number;
        max -= min;
        do {
            number = (int)(Math.random() * ++max) + min;
            listOfNumber.add(number);
        } while(listOfNumber.size() != numberOfPerson);

        return listOfNumber;
    }

    static List readFromFile(String nameOfFile){
        List<String> listPfName = new ArrayList<>();
        String pathToFile = path + nameOfFile;
        try {
            listPfName = Files.readAllLines(Paths.get(pathToFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listPfName;
    }

    //не могу придумать, как осуществить создание List<Person> с параметрами name, surname, age
    //которые берутся из List<String> name, List<String> surname, List<Integer> age, соответственно
    //можно ли вообще так делать?
    static List<Person> fillListOfPersone(List<String> name, List<String> surname, List<Integer> age, int numberOfPerson){
        List<Person> peopleList = new ArrayList<>();
        return peopleList;
    }

}
