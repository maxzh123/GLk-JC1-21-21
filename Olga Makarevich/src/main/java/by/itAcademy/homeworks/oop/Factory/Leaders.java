package by.itAcademy.homeworks.oop.Factory;

public abstract class Leaders extends Employee implements Wage {

    public Leaders(String nameOfEmployee, String lastNameOfEmployee, double workingHoursPerMonth, double hoursWorkedPerMonth, double salaryPerMonth, double prizePerMonth) {
        super(nameOfEmployee, lastNameOfEmployee, workingHoursPerMonth, hoursWorkedPerMonth, salaryPerMonth, prizePerMonth);
    }
}
