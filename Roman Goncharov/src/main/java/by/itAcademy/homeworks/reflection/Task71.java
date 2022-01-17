package by.itAcademy.homeworks.reflection;

/**
 * Задание 71
 * Создайте класс с методом printHelloWorld(). Вызвать метод с помощью рефлексии из основной программы.
 */

public class Task71 {
    public static void main(String[] args) {
        Man man = new Man("Рома", 24);
        Task70.methodCallByReflection(man, "printHelloWorld");
    }
}