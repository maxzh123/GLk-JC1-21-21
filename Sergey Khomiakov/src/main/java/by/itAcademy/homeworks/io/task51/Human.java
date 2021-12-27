package by.itAcademy.homeworks.io.task51;

import java.util.Random;

public class Human {
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
        age = random.nextInt(90)+1;


    }

    @Override
    public String toString() {
        return
                "Имя = " + name +
                ", Фамилия = " + surname +
                ", Возраст = " + age + ";" ;
    }
}
