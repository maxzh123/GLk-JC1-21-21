package by.itAcademy.homeworks.oop;

public abstract class AbstractCl implements SmartAbilities {
    protected boolean status = false;
    protected String brand;
    protected String model;
    protected int year;

    public void turnOn() {
        System.out.println("Прибор включен");
        status = true;
    }

    public void turnOff() {
        System.out.println("Прибор выключен");
        status = false;
    }

    public void printInfo() {
        System.out.println("Бренд - " + brand + "\nМодель - " + model + "\nГод производства - " + year);
        System.out.println();
        status();
        System.out.println();
    }

    private void status() {
        if (this.status) {
            System.out.println("Прибор включен в данный момент времени ");
        } else {
            System.out.println("Прибор выключен в данный момент времени ");
        }
    }
}
