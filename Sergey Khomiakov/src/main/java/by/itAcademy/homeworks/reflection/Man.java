package by.itAcademy.homeworks.reflection;

/** Задание 70
 * 1) Создать класс Man .
 * 2) Создать в классе набор полей и методов (не менее 3).
 * 3) Создать метод, который распечатает информацию о классе с помощью рефлексии.
 * 4) Вызвать метод с помощью рефлексии из основной программы.
 */

public class Man {
    private String name;
    private String surname;
    private int age;
    private String info;

    public Man(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    private String getInfo(){
        return info = "Hello! I created a private method! You can`t see this info!";
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


    private void printData() {
        System.out.println("Man{" + "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age=" + age + ", info=" + info +
                    '}');
    }
}
