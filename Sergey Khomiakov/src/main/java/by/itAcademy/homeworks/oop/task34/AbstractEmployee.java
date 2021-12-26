package by.itAcademy.homeworks.oop.task34;

public abstract class AbstractEmployee implements BehaviorForEmployees{
    protected String name;
    protected static final double salary = 500;       // оклад
    protected double workingHours, standardHours;     // отработано часов, норма часов
    protected String position;                        // должность
    protected double bonus;                           // премия
    protected double increaseCoefficient;             // повышающий коэффициент

    @Override
    public void getSalary() {
        double totalSalary = (salary * increaseCoefficient + bonus) * (workingHours/standardHours);
        System.out.printf("Получаем зарплату по итогам работы: %.2f%n",totalSalary);
        }

    @Override
    public void work() {
        System.out.println("Работаем");
    }

    @Override
    public void takeABreak() {
        System.out.println("Отдыхаем");
    }


    public void getInfo() {
        System.out.println("Работник " + name + " занимает должность " + position);
    }
}
