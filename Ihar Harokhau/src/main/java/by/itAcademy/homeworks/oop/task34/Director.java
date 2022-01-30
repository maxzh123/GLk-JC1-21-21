package by.itAcademy.homeworks.oop.task34;

public class Director extends AbstractWorker{
    public Director(String position, String name){
        this.position = position;
        this.name = name;
    }

    @Override
    public void getSalary() {
        super.bonus = 3000;
        super.increaseCoefficient = 6.39;
        System.out.println("Зарплата: " + (salary * increaseCoefficient + bonus));
    }

    @Override
    public void takeBreak() {
        System.out.println("Устал.");
    }

    @Override
    public void work() {
        System.out.println("Сегодня встреча с тремя инвесторами");
    }
}
