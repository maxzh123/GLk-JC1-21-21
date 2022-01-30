package by.itAcademy.homeworks.lamda;

/**
 * Задание 62
 * Создайте класс Person с полями name, surname, age. Сгенерируйте группу из 100 человек в возрасте от 15 до 30.
 * Напишите одну непрерывную цепочку stream вызовов, которая:
 * 1. выбирает объекты, возраст которых меньше 21;
 * 2. распечатывает их на экран;
 * 3. сортирует по фамилии, а потом по имени (использовать thenComparing у объекта Comparator);
 * 4. берет 4 первых объекта;
 * 5. формирует коллекцию из фамилий объектов;
 * 6. агрегирует все в коллекцию.
 */

import by.itAcademy.homeworks.io.Task51Objects.Person;
import by.itAcademy.homeworks.io.Task51Objects.RandomVariables;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task62 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            people.add(new Person(RandomVariables.randomName(), RandomVariables.randomSurname(),
                    (int) (Math.random() * 16) + 15));
        }
        List<String> finalPeople = people.stream()
                .filter((x) -> x.getAge() < 21)
                .peek(System.out::println)
                .sorted((Comparator.comparing(Person::getSurname).thenComparing(Person::getName)))
                .limit(4)
                .map(Person::getSurname)
                .collect(Collectors.toList());
        System.out.println("\nОкончательный результат: " + finalPeople);
    }
}