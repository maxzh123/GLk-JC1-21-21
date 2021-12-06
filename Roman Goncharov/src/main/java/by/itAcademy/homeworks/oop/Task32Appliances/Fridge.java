package by.itAcademy.homeworks.oop.Task32Appliances;

public class Fridge extends AppForKitchen{
    @Override
    public String getName() {
        name = "Холодильник";
        return name;
    }

    public String action() {
        action = "Положить продукты";
        return action;
    }

    @Override
    public void isOn() {
        System.out.println("Подключен к электросети на постоянной основе");
    }

    public void say() {
        System.out.println(getName());
        isOn();
        System.out.println(action());
    }
}
