package by.itAcademy.homeworks.patterns.Task68Objects;

public class Director {
    public void createMan(Builder builder) {
        builder.setGender(Gender.MALE);
        builder.setName("Роман");
        builder.setSurname("Гончаров");
        builder.setYearOfBirth(1997);
        builder.setTemperamentType(TemperamentType.MELANCHOLIC);
    }

    public void createWoman(Builder builder) {
        builder.setGender(Gender.FEMALE);
        builder.setName("Елизавета");
        builder.setSurname("Маёрова");
        builder.setYearOfBirth(1995);
        builder.setTemperamentType(TemperamentType.SANGUINE);
    }
}