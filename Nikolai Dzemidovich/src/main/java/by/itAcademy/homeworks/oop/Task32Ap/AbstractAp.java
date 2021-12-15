package by.itAcademy.homeworks.oop.Task32Ap;

public abstract class AbstractAp implements RoboticAbility {
    protected boolean status = false;
    protected String brand, model;
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
        System.out.println("Бренд - " + brand + "\n Модель - " + model + "\n Год производства - " + year);
        System.out.println();
        status();
        System.out.println();
    }

    private void status() {
        if (this.status) {
            System.out.println("Прибор включен в данный момент");
        } else {
            System.out.println("Прибор выключен в данный момент");
        }
    }


}
