package by.itAcademy.homeworks.oop.Task34Ap;

import by.itAcademy.homeworks.types.MyReadHelper;

import java.math.BigDecimal;

public abstract class Employee implements ActionWithSalary {

    protected String name, secondName;
    protected String passportNumber, registration;
    protected BigDecimal finalSalary;
    protected double percent, salaryForHour, workHour, salary, workDone;


    public abstract void getJobDescription();

    public void setPersonalInformation() {
        this.passportNumber = MyReadHelper.readLine("Введите серию паспорта:");
        this.registration = MyReadHelper.readLine("Введите адрес регистрации");
        System.out.println("\nНомер паспорта " + passportNumber + "\nАдрес регистрации :" + registration + "\n");

    }

    public void setSalary() {
        this.finalSalary = new BigDecimal(salary + salaryForHour * workHour + percent * workDone);
        System.out.println("Зарплата сотрудника = " + this.finalSalary + "\n");

    }
}
