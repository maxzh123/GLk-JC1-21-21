package by.itAcademy.homeworks.oop;

public class Director extends AbstractWorker {
    public Director(String position, String name){
        this.position = position;
        this.name = name;

    }
    @Override
    public void work() {
        System.out.println("Сегодня встреча с тремя инвесторами");
    }
    @Override
    public void takeABreak() {
        System.out.println("Хочу спать и курить..Надо найти glo");
    }

    @Override
    public void getSalary() {
        super.bonus = 3500;
        super.increaseCoefficient = 6.39;
        System.out.println("Зарплата: " + (salary * increaseCoefficient + bonus));
    }

}
