package by.itAcademy.oop;

import java.util.Calendar;
import java.util.Date;

public class OopRunner {


    public static void main(String[] args) {

        Cat cat=new Cat();
        cat.царапаться();
        cat.say();

        Animal[] pets=new Animal[10];
        int i=0;
        pets[i++]=new Doberman();
        pets[i++]=getAnon();
        pets[i++]=new Doberman();
        pets[i++]=new Cat();
        pets[i++]=new Doberman();
        pets[i++]=new Cat();
        pets[i++]=new MainKun();
        pets[i++]=getAnimal();
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

    private static class Дракон implements Animal{

        @Override
        public void say() {
            System.out.println("ЛЛЛЛЛЛЛЛЛЛЛЛЛЛЛ. я калтавый длакон!");
        }
    }
    public static Animal getAnimal(){
        return new Дракон();
    }
    public static Animal getAnon(){
        return new Animal() {
            @Override
            public void say() {
                System.out.println("Битарды всегда в аноне.");
            }
        };
    }

}
