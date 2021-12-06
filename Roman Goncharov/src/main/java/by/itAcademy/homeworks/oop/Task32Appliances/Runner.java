package by.itAcademy.homeworks.oop.Task32Appliances;

/**
 Создать цепочку наследования классов, описывающих бытовую технику. Создать несколько объектов этих классов, часть из
 них включить в розетку.
 */

public class Runner {
    public static void main(String[] args) {
        Appliances[] app = new Appliances[4];
        app[0] = new Fridge();
        app[1] = new Cooker();
        app[2] = new BarFridge();
        app[3] = new Multicooker();
        for (int i = 0; i < app.length; i++){
            app[i].say();
        }
    }
}
