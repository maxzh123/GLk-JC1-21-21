package by.itAcademy.homeworks.reflection;

/**
 * Задание 70
 * Создать класс Man c произвольным набором полей и методов (не менее 3).
 * Создать метод, который распечатает информацию о классе с помощью рефлексии.
 * Вызвать метод с помощью рефлексии из основной программы.
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task70 {
    public static void main(String[] args) {
        Man man = new Man("Дима", 25);
        methodCallByReflection(man, "printClassFields");
        methodCallByReflection(man, "printClassMethods");
        methodCallByReflection(man, "printClassConstructors");
    }

    public static void methodCallByReflection(Object obj, String methodName) {
        try {
            Method method = obj.getClass().getDeclaredMethod(methodName);
            method.setAccessible(true);
            method.invoke(obj);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
