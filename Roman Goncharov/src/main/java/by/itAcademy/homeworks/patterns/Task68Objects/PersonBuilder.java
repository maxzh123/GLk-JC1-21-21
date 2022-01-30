package by.itAcademy.homeworks.patterns.Task68Objects;

public class PersonBuilder implements Builder {
    private Gender gender;
    private String name;
    private String surname;
    private int yearOfBirth;
    private TemperamentType temperamentType;

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public void setTemperamentType(TemperamentType temperamentType) {
        this.temperamentType = temperamentType;
    }

    public Person getPerson() {
        return new Person(gender, name, surname, yearOfBirth, temperamentType);
    }
}