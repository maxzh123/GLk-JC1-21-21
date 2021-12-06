package by.itAcademy.homeworks.oop.Task32Appliances;

public class Cooker extends AppForKitchen{
    @Override
    public String getName() {
        name = "Плита";
        return name;
    }

    @Override
    public String action() {
        action = "Приготовить суп";
        return action;
    }

    public void say() {
        System.out.println(getName());
        isOn();
        System.out.println(action());
        isOff();
    }
}
