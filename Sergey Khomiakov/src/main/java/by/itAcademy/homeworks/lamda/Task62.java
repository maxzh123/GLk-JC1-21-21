package by.itAcademy.homeworks.lamda;

import by.itAcademy.homeworks.io.task51.Human;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/** Задание 62
 *  1)Создать класс Person с полями name, surname, age. Сгенерируйте группу из 100 человек в возрасте от 15 до 30.
 *  2)Написать ОДНУ НЕПРЕРЫВНУЮ цепочку stream вызовов, которая:
 *  - выбирает объекты, возраст которых меньше 21;
 *  - распечатывает их на экран;
 *  - сортирует по фамилии, а потом по имени (использовать thenComparing у объекта Comparator);
 *  - берет 4 первых объекта;
 *  - формирует коллекцию из фамилий объектов;
 *  - агрегирует все в коллекцию.
 *
 */

public class Task62 {
    public static void main(String[] args) {
        List<Human> listOfPerson = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            listOfPerson.add(new Human());
        }
        List<String> resultListOfPerson = listOfPerson.stream()
                .filter(humanAge -> humanAge.getAge() < 21)
                .peek(Human -> System.out.println("Имя - " + Human.getName() + "; Фамилия - " + Human.getSurname() + "; Возраст - " + Human.getAge()))
                .sorted((Comparator.comparing((Human::getSurname)).thenComparing(Human::getName)))
                .limit(4)
                .map(Human::getSurname)
                .collect(Collectors.toList());
        System.out.println("Результат сортировки и преобразований:");
        for(String surname: resultListOfPerson){
            System.out.println("Фамилия: " + surname);
        }




    }
}
