package by.itAcademy.homeworks.oop.task32;

/**> Создать цепочку наследования (минимум 3 звена) классов, описывающих
 * бытовую технику. Создать несколько объектов описанных классов, часть из них
 * включить в розетку. Иерархия должна иметь хотя бы три уровня.
 */

public class Task32 {
    public static void main(String[] args) {
        MicrowaveOven mic = new MicrowaveOven("Микроволновая печь", "b228", "Samsung, Vietnam", 2000);
        mic.turnOn();
        while(mic.isOn){
            mic.printMenu();
        }

        Iron homeIron1 = new Iron("Утюг", "VT-1232", "VITEK, China", 1200);
        homeIron1.turnOn();
        while(homeIron1.isOn){
            homeIron1.printMenu();
        }

    }
}
