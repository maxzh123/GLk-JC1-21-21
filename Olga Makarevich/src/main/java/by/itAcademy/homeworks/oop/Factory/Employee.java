package by.itAcademy.homeworks.oop.Factory;

public abstract class Employee implements Wage{
    private String nameOfEmployee;
    private String lastNameOfEmployee;
    private double workingHoursPerMonth;
    private double hoursWorkedPerMonth;
    private double salaryPerMonth;
    private double prizePerMonth;

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public void setNameOfEmployee(String nameOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
    }

    public String getLastNameOfEmployee() {
        return lastNameOfEmployee;
    }

    public void setLastNameOfEmployee(String lastNameOfEmployee) {
        this.lastNameOfEmployee = lastNameOfEmployee;
    }

    public double getWorkingHoursPerMonth() {
        return workingHoursPerMonth;
    }

    public void setWorkingHoursPerMonth(double workingHoursPerMonth) {
        this.workingHoursPerMonth = workingHoursPerMonth;
    }

    public double getHoursWorkedPerMonth() {
        return hoursWorkedPerMonth;
    }

    public void setHoursWorkedPerMonth(double hoursWorkedPerMonth) {
        this.hoursWorkedPerMonth = hoursWorkedPerMonth;
    }

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(double salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public double getPrizePerMonth() {
        return prizePerMonth;
    }

    public void setPrizePerMonth(double prizePerMonth) {
        this.prizePerMonth = prizePerMonth;
    }

    public Employee(String nameOfEmployee, String lastNameOfEmployee, double workingHoursPerMonth, double hoursWorkedPerMonth, double salaryPerMonth, double prizePerMonth) {
        setNameOfEmployee(nameOfEmployee);
        setLastNameOfEmployee(lastNameOfEmployee);
        setWorkingHoursPerMonth(workingHoursPerMonth);
        setHoursWorkedPerMonth(hoursWorkedPerMonth);
        setSalaryPerMonth(salaryPerMonth);
        setPrizePerMonth(prizePerMonth);
    }

    @Override
    public double calculateSalary(){
        double salary = this.getSalaryPerMonth()/this.getWorkingHoursPerMonth()*getHoursWorkedPerMonth()+this.getPrizePerMonth();
        return salary;
    }
}
