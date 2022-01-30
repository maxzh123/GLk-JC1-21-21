package by.itAcademy.homeworks.oop.task34;

public class Engineer extends AbstractWorker{
    public Engineer (String position, String name, double workingHours, double standardHours){
        this.position = position;
        this.name = name;
        this.workingHours = workingHours;
        this.standardHours = standardHours;
    }

    @Override
    public void work() {
        System.out.println("Полетела база данных,чёрт!)");
    }

    @Override
    public void takeBreak() {
        System.out.println("Пойду за кофе и пиццей");
    }

    @Override
    public void getSalary() {
        super.increaseCoefficient = 1.65;
        super.bonus = 400;
        super.getSalary();
    }
}