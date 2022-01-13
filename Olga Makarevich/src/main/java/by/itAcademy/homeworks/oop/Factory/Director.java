package by.itAcademy.homeworks.oop.Factory;

public class Director extends Leaders {
    public Director(String nameOfEmployee, String lastNameOfEmployee, double workingHoursPerMonth, double hoursWorkedPerMonth, double salaryPerMonth, double prizePerMonth) {
        super(nameOfEmployee, lastNameOfEmployee, workingHoursPerMonth, hoursWorkedPerMonth, salaryPerMonth, prizePerMonth);
    }

    @Override
    public double calculateSalary(){
        double salary = getSalaryPerMonth() / getWorkingHoursPerMonth()*getHoursWorkedPerMonth() + getPrizePerMonth()*getHoursWorkedPerMonth() / getWorkingHoursPerMonth();
        return salary;
    }
}
