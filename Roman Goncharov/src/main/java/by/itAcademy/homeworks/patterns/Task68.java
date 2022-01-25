package by.itAcademy.homeworks.patterns;

/**
 * Задание 68
 * Создайте класс Person с полями: имя, фамилия, год рождения. Реализуйте у этого класса паттерн Строитель.
 * Введите поля с клавиатуры и заполните объект класса Person с помощью паттерна Строитель.
 */

import by.itAcademy.homeworks.patterns.Task68Objects.Director;
import by.itAcademy.homeworks.patterns.Task68Objects.Person;
import by.itAcademy.homeworks.patterns.Task68Objects.PersonBuilder;

public class Task68 {
    public static void main(String[] args) {
        Director director = new Director();
        PersonBuilder builder = new PersonBuilder();
        director.createMan(builder);
        Person man = builder.getPerson();
        System.out.println(man);
        director.createWoman(builder);
        Person woman = builder.getPerson();
        System.out.println("\n" + woman);
    }
}