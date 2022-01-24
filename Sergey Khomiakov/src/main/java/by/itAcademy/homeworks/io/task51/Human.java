package by.itAcademy.homeworks.io.task51;

import java.io.Serializable;
import java.util.Random;

public class Human implements Serializable {
    private static final long serialVersionUID = 12738495960L;

    private String name, surname;
    private int age;
    Name [] names = Name.values();
    Surname [] surnames = Surname.values();

    public Human(String name, String surname, int age){
        this.name = name;
        this.surname = name;
        this.age = age;
    }

    public Human(){                             //конструктор, который создает человека со случайными параметрами
        Random random = new Random();
        name = String.valueOf(names[random.nextInt(names.length)]);
        surname = String.valueOf(surnames[random.nextInt(names.length)]);
        age = random.nextInt(15)+15;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "Имя = " + name +
                ", Фамилия = " + surname +
                ", Возраст = " + age + ";" ;
    }
}
