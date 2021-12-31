package by.itAcademy.homeworks.io.Task51Objects;

import java.io.Serializable;

public class Person implements Serializable {
    private String name, surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return name + " " + surname + ": " + age + " years";
    }
}
