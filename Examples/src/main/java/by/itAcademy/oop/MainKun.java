package by.itAcademy.oop;

public class MainKun extends Cat{

    public MainKun(){
        super("Мэйнкун");
    }

    public void setIam(String iam){
        this.iam=iam;
    }

    @Override
    public void say(){
        System.out.println("Я сожру вашего тузика!");
    }
}
