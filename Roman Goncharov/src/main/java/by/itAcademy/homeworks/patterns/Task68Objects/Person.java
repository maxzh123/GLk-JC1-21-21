package by.itAcademy.homeworks.patterns.Task68Objects;

public class Person {
    private final Gender gender;
    private final String name;
    private final String surname;
    private final int yearOfBirth;
    private final TemperamentType temperamentType;

    public Person(Gender gender, String name, String surname, int yearOfBirth, TemperamentType temperamentType) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.temperamentType = temperamentType;
    }

    public Gender getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public TemperamentType getTemperamentType() {
        return temperamentType;
    }

    @Override
    public String toString() {
        return "Пол: " + gender +
                "\nИмя: " + name +
                "\nФамилия: " + surname +
                "\nГод рождения: " + yearOfBirth +
                "\nТип темперамента: " + temperamentType;
    }
}