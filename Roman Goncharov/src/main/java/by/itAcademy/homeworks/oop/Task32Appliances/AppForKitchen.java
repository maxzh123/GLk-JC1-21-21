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

    public String getName() {
        return name;
    }

    public String description(){
        return description;
    }

    public void isOn() {
        System.out.println("Включить в розетку.");
    }

    public void isOff() {
        System.out.println("Выключить с розетки.");
    }

    public void action(){}

    public void run(){}
}
