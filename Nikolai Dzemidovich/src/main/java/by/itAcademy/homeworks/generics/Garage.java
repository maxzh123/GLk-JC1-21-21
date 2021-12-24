package by.itAcademy.homeworks.generics;

public class Garage<T extends Vehicle> {
    protected T vehicle;

    public void addVehicle(T vehicle) {
        this.vehicle = vehicle;
    }

    public String getInfo() {
        return vehicle.name;
    }


}
