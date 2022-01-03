package by.itAcademy.homeworks.oop;


/**Создать цепочку наследования (минимум 3 звена) классов,
 * описывающих бытовую технику. Создать несколько объектов
 * описанных классов, часть из них включить в розетку.
 * Иерархия должна иметь хотя бы три уровня **/

public class Task32 {
    public static void main(String[] args) {
        Oven ov = new Oven("Духовой шкаф", "HBJ577EB0R", "Bosch", 2000);
        Microwave mi = new Microwave("Микроволновая печь", "BFL623MC3", "Bosch", 800);
        ov.of();
        ov.printState();
        mi.on();
        mi.printState();
    }
}
class homeGadget {
    boolean state;
    String type,model,producer;
    int power;
    void on () {
        this.state=true;
    }
    void of () {
        this.state=false;
    }
    void printState(){
        System.out.println("Прибор "+type+"\nМодель "+model+"\nПроизводитель "+producer+"\nМощность "+power);
        if(state){
            System.out.println("Прибор включен");
        }else {
            System.out.println("Прибор выключен");
        }
    }
}
class Oven extends homeGadget{
    Oven(String type, String model, String producer, int power){
        this.type=type;
        this.model=model;
        this.producer=producer;
        this.power=power;
    }
}
class Microwave extends homeGadget{
    Microwave(String type, String model, String producer, int power) {
        this.type = type;
        this.model = model;
        this.producer = producer;
        this.power = power;
    }
}


