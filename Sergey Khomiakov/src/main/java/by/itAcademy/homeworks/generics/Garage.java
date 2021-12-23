package by.itAcademy.homeworks.generics;

public class Garage <T extends Vehicle>{
    private T vehicle;

    public void addVehicleToGarage(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicleFromGarage() {
        return vehicle;
    }
}
