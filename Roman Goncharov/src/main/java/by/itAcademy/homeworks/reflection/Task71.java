package by.itAcademy.homeworks.reflection;

/**
 * Задание 71
 * Создайте класс с методом printHelloWorld(). Вызвать метод с помощью рефлексии из основной программы.
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task71 {
    public static void main(String[] args) {
        Man man = new Man("Рома", 24);
        try {
            Method method = Man.class.getDeclaredMethod("printHelloWorld");
            method.setAccessible(true);
            method.invoke(man);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
