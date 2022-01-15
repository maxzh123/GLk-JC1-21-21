package by.itAcademy.homeworks.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Man {
    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Меня зовут " + name + " мне " + age + " years";
    }

    private void printClassFields() {
        Field[] fields = Man.class.getDeclaredFields();
        System.out.println("Все поля класса Man:");
        for (Field field : fields) {
            System.out.println("Поле: " + field.getName() + ", тип: " + field.getType());
        }
    }

    private void printClassMethods() {
        Method[] methods = Man.class.getDeclaredMethods();
        System.out.println("Все методы класса Man:");
        for (Method method : methods) {
            System.out.println("Метод " + method.getName() + ", тип возвращаемого значения: " + method.getReturnType());
        }
    }

    private void printClassConstructors() {
        Constructor[] constructors = Man.class.getConstructors();
        System.out.println("Конструкторы класса Man:");
        for (Constructor constructor : constructors) {
            System.out.print("Конструктор c параметрами ");
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + "  ");
            }
        }
    }

    private void printHelloWorld() {
        System.out.println(this + ": Привет, мир.");
    }
}