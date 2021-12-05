package by.itAcademy.homeworks.oop.Task32Appliances;

public class BarFridge extends Fridge {
    @Override
    public String getName() {
        name = "Минибар";
        return name;
    }

    @Override
    public String action() {
        action = "Положить шампанское";
        return action;
    }

}
