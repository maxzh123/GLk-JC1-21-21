package by.itAcademy.homeworks.oop.task32;

public abstract class Abstaract implements Appliances {
    protected boolean status = false;
    protected String brand;
    protected String model;

    @Override
    public void turnOn() {
        System.out.println("The device is connected to the electrical network.");
        status = true;
    }

    @Override
    public void turnOff() {
        System.out.println("The device is NOT connected to the electrical network.");
        status = false;
    }

    @Override
    public void printInfo() {
        System.out.println("Brand - " + brand + "\nModel - " + model + "\n");
        status();
        System.out.println("----------------------------------------------------------");
    }

    private void status() {
        if (this.status){
            System.out.println("The device is connected to the electrical network now.");
        }else{
            System.out.println("The device is NOT connected to the electrical network now.");
        }
    }
}
