package by.itAcademy.homeworks.oop.task32;

/**
 * Задание 32
 *
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику.
 * Создать несколько объектов описанных классов, часть из них включить в розетку.
 */

public class Runner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Apple MacBook", "Air 13");
        Humidifier humidifier = new Humidifier("BRUNE", "B 500 Professional UV-C");
        TV tv = new TV("LG", "32LP500B6LA");
        laptop.turnOn();
        laptop.printInfo();
        humidifier.turnOn();
        humidifier.printInfo();
        tv.turnOff();
        tv.printInfo();
    }
}
