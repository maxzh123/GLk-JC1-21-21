package by.itAcademy.oop;

import java.util.Calendar;
import java.util.Date;

public class OopRunner {


    public static void main(String[] args) {
        Animal[] pets=new Animal[10];
        int i=0;
        pets[i++]=new Doberman();
        pets[i++]=new Cat();
        pets[i++]=new Doberman();
        pets[i++]=new Cat();
        pets[i++]=new Doberman();
        pets[i++]=new Cat();
        pets[i++]=new MainKun();
        pets[i++]=new Cat();
        sayAll(pets);
//        doSay(new MainKun());


    }

    private static void sayAll(Animal[] animals){

        for(int i=0;i<animals.length;i++){
            if (animals[i]!=null){
                doSay(animals[i]);
            }
        }
    }

    private static void doSay(Dog dog){
        dog.saySaySay();
    }
    private static void doSay(Cat cat){
        cat.царапаться();
    }
    private static void doSay(Animal animal){
        //animal.say();
        doSay(animal, 1900+(new Date()).getYear());
    }
    private static void doSay(Animal animal,int year){
        animal.say();
        System.out.println(year);
    }

}
