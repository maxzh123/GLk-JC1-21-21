package by.itAcademy.homeworks.oop.Factory;

public abstract class Workers extends Employee implements Wage {
    public Workers(String nameOfEmployee, String lastNameOfEmployee, double workingHoursPerMonth, double hoursWorkedPerMonth, double salaryPerMonth, double prizePerMonth, double salaryForOnePiece, int partsScheduledToBeReleased, int numberOfPartsMade) {
        super(nameOfEmployee, lastNameOfEmployee, workingHoursPerMonth, hoursWorkedPerMonth, salaryPerMonth, prizePerMonth);
        setSalaryForOnePiece(salaryForOnePiece);
        setPartsScheduledToBeReleased(partsScheduledToBeReleased);
        setNumberOfPartsMade(numberOfPartsMade);
        salaryPerMonth = 0;
    }

    double salaryForOnePiece;
    int partsScheduledToBeReleased;
    int numberOfPartsMade;

    public double getSalaryForOnePiece() {
        return salaryForOnePiece;
    }

    public void setSalaryForOnePiece(double salaryForOnePiece) {
        this.salaryForOnePiece = salaryForOnePiece;
    }

    public int getPartsScheduledToBeReleased() {
        return partsScheduledToBeReleased;
    }

    public void setPartsScheduledToBeReleased(int partsScheduledToBeReleased) {
        this.partsScheduledToBeReleased = partsScheduledToBeReleased;
    }

    public int getNumberOfPartsMade() {
        return numberOfPartsMade;
    }

    public void setNumberOfPartsMade(int numberOfPartsMade) {
        this.numberOfPartsMade = numberOfPartsMade;
    }

    @Override
    public double calculateSalary() {
        double salary;
        if(getNumberOfPartsMade() < getPartsScheduledToBeReleased()) {
            setPrizePerMonth(0);
        }
        salary = getNumberOfPartsMade() * getSalaryForOnePiece() + getPrizePerMonth();
        return salary;
    }
}
