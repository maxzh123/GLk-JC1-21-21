package by.itAcademy.homeworks.lamda;

public class Person {
    private String name;
    private String surname;
    private int age;

    Person(String name, String surname){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    Person(){
    }

    @Override
    public String toString(){
        return getName() + " " + getSurname() + ", " + getAge();
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

}
