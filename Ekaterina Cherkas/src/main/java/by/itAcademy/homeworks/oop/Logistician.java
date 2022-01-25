package by.itAcademy.homeworks.oop;

public class Logistician extends Engineer {
    public Logistician(String position, String name, double workingHours, double standardHours) {
        super(position, name, workingHours, standardHours);
    }
    @Override
    public void work() {
        System.out.println("Нужно координировать грузоперевозки");
    }
    @Override
    public void takeABreak() {
        System.out.println("Пойду в ближайшую кулинарию");
    }

    @Override
    public void getSalary() {
        super.increaseCoefficient = 2.89;
        super.bonus = 200;
        super.getSalary();
    }
}