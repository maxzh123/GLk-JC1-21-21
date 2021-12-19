package by.itAcademy.homeworks.oop.Task34Ap;

import by.itAcademy.homeworks.types.MyReadHelper;

public class Loader extends Employee {

    public Loader (String name, String secondName) {
        this.name = name;
        this.secondName = secondName;
    }

    public void getJobDescription() {
        System.out.println("Квалификация - грузчик.");
        System.out.println("Должнастная инструкция:\n @какая-то информация@\n");
    }

    @Override
    public void setSalary() {
        System.out.println("Зарплата Грузчика");
        super.percent = MyReadHelper.readDouble("Введите процент от суммы работ : ") / 100;
        super.workDone = MyReadHelper.readDouble("Введите проделанную работу в денежном выражении");
        super.setSalary();
    }
}
