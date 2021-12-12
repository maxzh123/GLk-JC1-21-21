package by.itAcademy.homeworks.oop.Task32Appliances;

/**
 * Задание 32
 * Создать цепочку наследования классов, описывающих бытовую технику. Создать несколько объектов этих классов, часть из
 * них включить в розетку.
 */

public class Task32 {
    public static void main(String[] args) {
        Appliances[] app = new Appliances[3];
        app[0] = new Fridge(4200,200);
        app[1] = new Cooker(4000,110);
        app[2] = new ElectricKettle(430,25);
        for (int i = 0; i < app.length; i++){
            app[i].run();
        }
    }
}
