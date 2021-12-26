package by.itAcademy.homeworks.oop.Factory;

public abstract class Leaders extends WorkingPeople{
    double salaryPerMonth;

    public Leaders (String name, String lastName, String position, double rateOfHoursPerMonth, double hoursWorkedPerMonth) {
        super(name, lastName, position, rateOfHoursPerMonth);
        this.salaryPerMonth = salaryPerMonth;
    }

    @Override
    public double calculateWages(double salaryPerMonth) {
        double calculateSalary = salaryPerMonth / rateOfHoursPerMonth * hoursWorkedPerMonth;
        System.out.println("Начисленная заработная плата " + position + " " + name + " " + lastName + "за отработанный месяц = " + rateOfHoursPerMonth);
        return calculateSalary;
    }
}
