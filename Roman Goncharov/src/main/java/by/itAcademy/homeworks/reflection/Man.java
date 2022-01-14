package by.itAcademy.homeworks.reflection;

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

    private void printHelloWorld() {
        System.out.println(this + ": Привет, мир.");
    }
}
