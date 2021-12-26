package by.itAcademy.homeworks.oop.Task34Ap;

import by.itAcademy.homeworks.types.MyReadHelper;

public class Chief extends Employee {

    public Chief(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public void getJobDescription() {
        System.out.println("Квалификация - Управляющий заводом.");
        System.out.println("Должнастная инструкция:\n @какая-то информация@\n");
    }

    @Override
    public void setSalary() {
        System.out.println("Зарплата Управляющего");
        super.salary = MyReadHelper.readDouble("Введите сумму оклада : ");
        super.setSalary();
    }

}

