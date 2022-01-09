package by.itAcademy.homeworks.oop;


/**Создать цепочку наследования (минимум 3 звена) классов,
 * описывающих бытовую технику. Создать несколько объектов
 * описанных классов, часть из них включить в розетку.
 * Иерархия должна иметь хотя бы три уровня **/

public class Task32 {
    public static void main(String[] args) {
        HomeGadget ov=new Oven();
        HomeGadget mi=new Microwave();
        ov.printState();
        ov.on();
        mi.printState();
        mi.off();
    }
}


