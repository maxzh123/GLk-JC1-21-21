package by.itAcademy.homeworks.generics;

public abstract class Vehicle {
    private final String name;
    protected String brand, model;

    protected Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String description() {
        return brand + " " + model;
    }
}
