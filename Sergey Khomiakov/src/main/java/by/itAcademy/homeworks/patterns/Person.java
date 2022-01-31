package by.itAcademy.homeworks.patterns;

/** Задание 68
 * 1) Создать класс Person с полями: имя, фамилия, год рождения.
 * 2) Реализовать у этого класса паттерн Строитель.
 * 3) Введите поля с клавиатуры и заполните объект класса Person с помощью паттерна Строитель.
 */

public class Person {
    private String name, surname;
    private int yearOfBirth;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public static class Builder{
        private final Person newPerson;

        public Builder(){
            newPerson = new Person();
        }

        public Builder setName(String name){
            newPerson.name = name;
            return this;
        }

        public Builder setSurname(String surname){
            newPerson.surname = surname;
            return this;
        }

        public Builder setYearOfBirth(int yearOfBirth){
            newPerson.yearOfBirth = yearOfBirth;
            return this;
        }

        public Person build(){
            return newPerson;
        }


    }


}
