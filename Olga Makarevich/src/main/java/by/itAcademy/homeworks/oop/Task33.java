package by.itAcademy.homeworks.oop;

import by.itAcademy.homeworks.oop.Factory.*;

public class Task33 {
    public static void main(String[] args) {

        Employee director1 = new Director("Иванов", "Иван", 160, 152, 5000, 2500); // 7125
        System.out.printf("Зарплата %-10s %-10s составляет %.2f руб.\n", director1.getNameOfEmployee(), director1.getLastNameOfEmployee(), director1.calculateSalary());

        Employee specialistOther = new Specialists("Милая", "Милана", 160, 152, 1000, 500, 0.9);
        System.out.printf("Зарплата %-10s %-10s составляет %.2f руб.\n", specialistOther.getNameOfEmployee(), specialistOther.getLastNameOfEmployee(), specialistOther.calculateSalary());
        Employee specialistSale = new SalesManager("Светлая", "Светлана", 160, 152, 1000, 500, 0.9);
        System.out.printf("Зарплата %-10s %-10s составляет %.2f руб.\n", specialistSale.getNameOfEmployee(), specialistSale.getLastNameOfEmployee(), specialistSale.calculateSalary());

        Locksmith locksmith1 = new Locksmith("Николаев", "Николай", 160, 152, 100, 10, 100, 90); // 900
        System.out.printf("Зарплата %-10s %-10s составляет %.2f руб.\n", locksmith1.getNameOfEmployee(), locksmith1.getLastNameOfEmployee(), locksmith1.calculateSalary());
        Locksmith locksmith2 = new Locksmith("Петров", "Петр", 160, 152, 100, 10, 100, 100); // 1100
        System.out.printf("Зарплата %-10s %-10s составляет %.2f руб.\n", locksmith2.getNameOfEmployee(), locksmith2.getLastNameOfEmployee(), locksmith2.calculateSalary());
    }
}
