package by.itAcademy.homeworks.oop.Factory;

public class Specialists extends Employee implements Wage{
    public double percentageOfPlanCompletion;

    public double getPercentageOfPlanCompletion() {
        return percentageOfPlanCompletion;
    }

    public void setPercentageOfPlanCompletion(double percentageOfPlanCompletion) {
        this.percentageOfPlanCompletion = percentageOfPlanCompletion;
    }

        public Specialists(String nameOfEmployee, String lastNameOfEmployee, double workingHoursPerMonth, double hoursWorkedPerMonth,
                           double salaryPerMonth, double prizePerMonth, double percentageOfPlanCompletion) {
        super(nameOfEmployee, lastNameOfEmployee, workingHoursPerMonth, hoursWorkedPerMonth, salaryPerMonth, prizePerMonth);
        setPercentageOfPlanCompletion(percentageOfPlanCompletion);
    }

    @Override
    public double calculateSalary(){
        double salary = this.getSalaryPerMonth() / this.getWorkingHoursPerMonth() * getHoursWorkedPerMonth() + this.getPrizePerMonth() * getPercentageOfPlanCompletion();
        return salary;
    }
}
