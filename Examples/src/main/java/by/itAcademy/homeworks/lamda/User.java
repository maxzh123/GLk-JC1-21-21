package by.itAcademy.homeworks.lamda;

public class User {
    private final String name;

    public User(String name) {
        this.name = name;
    }
    public void printName(){
        System.out.println(name);
    }

    static public void printStaticName(User a){
        System.out.println(User.class.getName());
    }
}
