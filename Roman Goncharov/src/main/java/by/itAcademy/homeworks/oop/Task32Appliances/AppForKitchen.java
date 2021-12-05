package by.itAcademy.homeworks.oop.Task32Appliances;

public class AppForKitchen implements Appliances {
    String name,action;

    public String getName() {
        return name;
    }

    public String action() {
        return action;
    }

    public void isOn() {
        System.out.println("Включить в розетку.");
    }

    public void isOff() {
        System.out.println("Выключить с розетки.");
    }

    @Override
    public void say() {
        System.out.println(getName());
        System.out.println(action());
    }
}
