package by.itAcademy.homeworks.generics;

public class Garage <T extends Vehicle> {
    private T typeOfVehicle;

    public T getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(T typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }
}
