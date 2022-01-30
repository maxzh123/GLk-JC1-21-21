package by.itAcademy.homeworks.oop.task34;

public abstract class AbstractWorker implements Salary{
    protected String name;
    protected static final double salary = 500;
    protected double workingHours, standardHours;
    protected String position;
    protected double bonus;
    protected double increaseCoefficient;

    @Override
    public void getSalary() {
        double totalSalary = (salary * increaseCoefficient + bonus) * (workingHours / standardHours);
        System.out.printf("Зарплата: %.2f%n", totalSalary);
    }

    @Override
    public void takeBreak() {
        System.out.println("Отдых.");
    }

    @Override
    public void work() {
        System.out.println("Работа.");
    }

    public void getInfo(){
        System.out.println("Сотрудник " + name + " занимает должность " + position);
    }
}
