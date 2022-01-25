package by.itAcademy.homeworks.generics;

public class Garage < T extends Vehicle> {
    private T vehicle;

    public void addVehicle(T vehicle){
        this.vehicle = vehicle;
    }

    public String toString(){
        return vehicle.getName() + " " + vehicle.description();
    }
}
