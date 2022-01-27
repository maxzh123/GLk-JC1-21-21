package by.itAcademy.homeworks.reflection;

import by.itAcademy.interfaces.basics.ITask1;
import by.itAcademy.interfaces.basics.ITask2;

public class AnimalPerson implements ITask1, ITask2 {
    private String name;
    private int age;

    public AnimalPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Deprecated
    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "AnimalPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
