package by.itAcademy.homeworks.oop.task34;

public class Engineer extends AbstractEmployee {

    public Engineer (String position, String name, double workingHours, double standardHours){
        this.position = position;
        this.name = name;
        this.workingHours = workingHours;
        this.standardHours = standardHours;
    }

    @Override
    public void work() {
        System.out.println("Работаем много и усердно... А может и нет ;)");
    }

    @Override
    public void takeABreak() {
        System.out.println("Перекур");
    }

    @Override
    public void getSalary() {
        super.increaseCoefficient = 1.89;
        super.bonus = 500;
        super.getSalary();
    }
}
