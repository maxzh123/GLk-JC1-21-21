package by.itAcademy.homeworks.patterns;

import by.itAcademy.homeworks.regexp.SimpleReader;

/** Задание 68
 * 1) Создать класс Person с полями: имя, фамилия, год рождения.
 * 2) Реализовать у этого класса паттерн Строитель.
 * 3) Ввести поля с клавиатуры и заполнить объект класса Person с помощью паттерна Строитель.
 */

public class Task68 {
    public static void main(String[] args) {
        System.out.println("Введите имя");
        String name = SimpleReader.readLine();
        System.out.println("Введите фамилию");
        String surname = SimpleReader.readLine();
        System.out.println("Введите год рождения");
        int yearOfBirth = SimpleReader.readInt();
        Person person = new Person.Builder().setName(name).setSurname(surname).setYearOfBirth(yearOfBirth).build();

        System.out.println(person);
    }
}
