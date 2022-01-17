package by.itAcademy.homeworks.threads;

/**Задание 56
 * 1. Создать программу, которая реализует deadlock между тремя потоками
 */

public class Task56 {
    public static void main(String[] args) {

        Person person1 = new Person("Вова");
        Person person2 = new Person("Женя");
        Person person3 = new Person("Гена");

        new Thread(() -> person1.call(person2)).start();
        new Thread(() -> person2.call(person3)).start();
        new Thread(() -> person3.call(person1)).start();
    }
}
