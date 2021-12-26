package by.itAcademy.homeworks.oop;

// Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику.
// Создать несколько объектов описанных классов, часть из них включить в розетку.
// Иерархия должна иметь хотя бы три уровня.

import by.itAcademy.homeworks.oop.App.Appliances;
import by.itAcademy.homeworks.oop.App.KitchenAppliances;
import by.itAcademy.homeworks.oop.App.LargeHomeAppliances;

public class Task32 {
    public static void main(String[] args) {
        Appliances washingMachine = new Appliances("large", 4000, 2021, "red", "el");
        Appliances vacuumСleaner = new Appliances("average", 2000, 2015, "grey", "el");
        LargeHomeAppliances refrigerator = new LargeHomeAppliances("large", 1000, 2016, "green", "el", "кухонная бытовая техника", "kitchen");
        LargeHomeAppliances freezer = new LargeHomeAppliances("large", 1500, 2017, "blue", "el", "кухонная бытовая техника", "kitchen");
        KitchenAppliances foodProcessor = new KitchenAppliances("average", 500, 2018, "black", "el", "кухонная бытовая техника", "kitchen", "default", 2);
        KitchenAppliances coffeeGrinder = new KitchenAppliances("small", 100, 2019, "black", "el", "кухонная бытовая техника", "kitchen", "coffee", 100);

        coffeeGrinder.turnOn(coffeeGrinder.getDeviceType());
        freezer.turnOn(freezer.getDeviceType());
    }
}
