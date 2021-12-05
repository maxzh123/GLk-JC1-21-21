package by.itAcademy.homeworks.oop.Task32Appliances;

public class Multicooker extends Cooker{
    @Override
    public String getName() {
        name = "Мультиварка";
        return name;
    }

    @Override
    public String action() {
        action = "Приготовить плов";
        return action;
    }
}
