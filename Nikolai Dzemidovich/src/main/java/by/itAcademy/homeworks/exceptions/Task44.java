package by.itAcademy.homeworks.exceptions;

import by.itAcademy.homeworks.types.MyReadHelper;


public class Task44 {

    public static void main(String[] args) {

        double salaryPerHour = MyReadHelper.readDouble("Введите оплачу за час: ");
        double hour = MyReadHelper.readDouble("Введите кол-во рабочих часов");

        try {
            System.out.println("Зарплата = " + getSalary(salaryPerHour, hour));
        } catch (SalaryExceptions e) {
            System.out.println(e.getMessage());
        }

    }

    public static double getSalary(double salaryPerHour, double hour) throws SalaryExceptions {

        if (salaryPerHour < 4.5 && hour < 0) {
            throw new SalaryExceptions("Почасовая оплата меньше минимальной и введено некорреектное кол-во часов");
        } else if (hour < 0) {
            throw new SalaryExceptions("Введено некорректное кол-во часов");
        } else if (salaryPerHour < 4.5) {
            throw new SalaryExceptions("Оплата в час меньше минимальной");
        } else {
            return salaryPerHour * hour;
        }
    }
}
