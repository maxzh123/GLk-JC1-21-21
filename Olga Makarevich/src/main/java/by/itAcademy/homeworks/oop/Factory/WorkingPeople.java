package by.itAcademy.homeworks.oop.Factory;

public abstract class WorkingPeople implements Wage{
    String name;
    String lastName;
    String position;
    double rateOfHoursPerMonth;
    double hoursWorkedPerMonth;


    public WorkingPeople(String name, String lastName, String position, double rateOfHoursPerMonth) {
        this.name= name;
        this.lastName = lastName;
        this.position = position;
        this.rateOfHoursPerMonth = rateOfHoursPerMonth;
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    @Override
    public double calculateWages(double salaryPerMonth) {
        double calculateSalary = salaryPerMonth / rateOfHoursPerMonth * hoursWorkedPerMonth;
        System.out.println("Начисленная заработная плата " + position + " " + name + " " + lastName + "за отработанный месяц = " + rateOfHoursPerMonth);
    return calculateSalary;
    }
}
