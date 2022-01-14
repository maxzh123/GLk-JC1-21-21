package by.itAcademy.homeworks.reflection;

/**
 * Задание 70
 * Создать класс Man c произвольным набором полей и методов (не менее 3).
 * Создать метод, который распечатает информацию о классе с помощью рефлексии.
 * Вызвать метод с помощью рефлексии из основной программы.
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task70 {
    public static void main(String[] args) {
        Man man = new Man("Дима", 25);
        try {
            Method methodOne = Task70.class.getMethod("printObjectFields", Object.class);
            Method methodTwo = Task70.class.getMethod("printObjectMethods", Object.class);
            Method MethodThree = Task70.class.getMethod("printObjectConstructors", Object.class);
            methodOne.invoke(Task70.class, man);
            methodTwo.invoke(Task70.class, man);
            MethodThree.invoke(Task70.class, man);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void printObjectFields(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        System.out.println("Все поля объекта:");
        for (Field field : fields) {
            System.out.println("Поле: " + field.getName() + ", тип: " + field.getType());
        }
    }

    public static void printObjectMethods(Object obj) {
        Method[] methods = obj.getClass().getDeclaredMethods();
        System.out.println("Все методы объекта:");
        for (Method method : methods) {
            System.out.println("Метод " + method.getName() + ", тип возвращаемого значения: " + method.getReturnType());
        }
    }

    public static void printObjectConstructors(Object obj) {
        Constructor[] constructors = obj.getClass().getConstructors();
        System.out.println("Конструкторы объекта:");
        for (Constructor constructor : constructors) {
            System.out.print("Конструктор c параметрами ");
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + "  ");
            }
        }
    }
}
