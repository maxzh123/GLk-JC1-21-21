package by.itAcademy.homeworks.oop.Factory;

public class SalesManager extends Specialists{
    public SalesManager(String nameOfEmployee, String lastNameOfEmployee, double workingHoursPerMonth, double hoursWorkedPerMonth, double salaryPerMonth, double prizePerMonth, double percentageOfPlanCompletion) {
        super(nameOfEmployee, lastNameOfEmployee, workingHoursPerMonth, hoursWorkedPerMonth, salaryPerMonth, prizePerMonth, percentageOfPlanCompletion);
    }

    @Override
    public double calculateSalary(){
        double salary = this.getSalaryPerMonth() / this.getWorkingHoursPerMonth() * getHoursWorkedPerMonth() + this.getPrizePerMonth() * getPercentageOfPlanCompletion() * 1.5;
        return salary;
    }
}
