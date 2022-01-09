package by.itAcademy.homeworks.threads;

/**
 * Задание 56
 * Создать программу, которая реализует deadlock между тремя потоками.
 */

import by.itAcademy.homeworks.threads.DeadlockTask56.Acquaintance;
import by.itAcademy.homeworks.threads.DeadlockTask56.Person;

public class Task56 {
    public static void main(String[] args) throws InterruptedException {
        Person[] people = {new Person("Миша"), new Person("Дима"), new Person("Коля")};
        Acquaintance[] acquaintances = {new Acquaintance(people[0], people[1]), new Acquaintance(people[1], people[2]),
                new Acquaintance(people[2], people[0])};
        Thread[] threads = {new Thread(acquaintances[0]), new Thread(acquaintances[1]), new Thread(acquaintances[2])};
        threads[0].start();
        threads[1].start();
        threads[2].start();
        Thread.sleep(15000);
        if (threads[0].isAlive() && threads[1].isAlive() && threads[2].isAlive()) {
            System.out.println("Deadlock :c");
        }
    }
}
