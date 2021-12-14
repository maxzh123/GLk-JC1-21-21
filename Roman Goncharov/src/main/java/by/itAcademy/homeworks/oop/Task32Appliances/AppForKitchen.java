package by.itAcademy.homeworks.oop.Task32Appliances;

import java.util.Scanner;

abstract class AppForKitchen implements Appliances {
    final private String name;
    protected String description;
    protected int area, height;
    Scanner console = new Scanner(System.in);

    protected AppForKitchen(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected String description(){
        return description;
    }

    protected void isOn() {
        System.out.println("Включить в розетку.");
    }

    protected void isOff() {
        System.out.println("Выключить с розетки.");
    }

    protected void action(){}

    public void run(){}
}
