package by.itAcademy.oop;

public class MainKun extends Cat{

    public MainKun(){
        super("Мэйнкун");
        super.say();
    }

    @Override
    public void say(){
        System.out.println("Я сожру вашего тузика!");
    }
}
