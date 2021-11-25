package by.itAcademy.oop;

public class Cat implements Animal{

    protected String iam="Дворовый кот";
    public Cat(){

    }
    public Cat(String iam){
        this.iam=iam;
    }

    public void царапаться(){
        System.out.println("я "+iam+"! Я вас всех исцарапаю!");
    }

    public void say(){
                System.out.println("Мяу");
    }

}
