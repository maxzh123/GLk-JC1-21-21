package by.itAcademy.homeworks.oop;

/** Задание 32
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих бытовую технику. Создать несколько
 * объектов описанных классов, часть из них включить в розетку. Иерархия должна иметь хотя бы три уровня.
 */

public class Task32 {
    public static void main(String[] args) {
        Teapot tea = new Teapot("Redmond","RK-G203S",2018);
        Fridge fri = new Fridge("Smeg","RF376RSIX",2019);
        HairDryer hai = new HairDryer("Dyson","HD07",2020);
        tea.turnOn();
        tea.printInfo();
        fri.turnOn();
        fri.printInfo();
        hai.turnOff();
        hai.printInfo();
    }
}
