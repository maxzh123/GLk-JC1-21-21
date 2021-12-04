package by.itAcademy.oop;

public class Cat implements Animal{

    static private int conut=0;

    private int num;
    private String iam="Дворовый кот";
    public Cat(){
        num=conut++;
    }
    public Cat(String iam){
        this.iam=iam;
        num=conut++;
    }

    public void царапаться(){
        System.out.println("я "+iam+" "+num+" "+"! Я вас всех исцарапаю!");
    }

    @Override
    public void say(){
                System.out.println("я "+iam+" "+num+" "+"Мяу");
    }

}
