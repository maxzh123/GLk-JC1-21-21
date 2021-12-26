package by.itAcademy.homeworks.generics.vehicle;

public class Car extends Vehicle {
    private String nameAuto;

    Car(String name, String nameAuto) {
        super("Auto");
        this.nameAuto = nameAuto;
    }
}
