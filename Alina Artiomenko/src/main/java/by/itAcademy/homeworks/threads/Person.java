package by.itAcademy.homeworks.threads;

public class Person {
    private String name;

    Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public synchronized void call(Person p){
        System.out.println(this.name + ": " + p.getName() + ", я звоню тебе");
        p.callBack(this);
    }

    public synchronized void callBack(Person p){
        System.out.println(this.name + ": " + p.getName() + ", я звоню тебе");
        p.callBack(this);
    }

    public synchronized void callBackTwo(Person p){
        System.out.println(this.name + ": " + p.getName() + ", я звоню тебе");
    }
}
