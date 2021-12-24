package by.itAcademy.homeworks.oop.Task34Ap;

import by.itAcademy.homeworks.types.MyReadHelper;

public class Engineer extends Employee {

    public Engineer(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public void getJobDescription() {
        System.out.println("Квалификация - младший инженер.");
        System.out.println("Должнастная инструкция:\n @какая-то информация@\n");
    }

    @Override
    public void setSalary() {
        System.out.println("Зарплата инженера");
        super.salaryForHour = MyReadHelper.readDouble("Введите оплату за час : ");
        super.workHour = MyReadHelper.readDouble("Введите сколько было отработано часов :");
        super.setSalary();
    }
}
