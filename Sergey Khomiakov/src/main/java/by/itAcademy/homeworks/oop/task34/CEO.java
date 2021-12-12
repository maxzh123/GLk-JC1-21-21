package by.itAcademy.homeworks.oop.task34;

public class CEO extends AbstractEmployee {

    public CEO(String position, String name){
        this.position = position;
        this.name = name;

    }

    @Override
    public void work() {
        System.out.println("Я руковожу... Я главный!!");
    }

    @Override
    public void takeABreak() {
        System.out.println("Людочка, а принесите мне коньячок");
    }

    @Override
    public void getSalary() {
        super.bonus = 2000;
        super.increaseCoefficient = 4.89;
        System.out.println("Получаем зарплату по итогам работы: " + (salary * increaseCoefficient + bonus));
        System.out.println("Неплохо...можно жить! Можно вообще не работать, ведь она не зависит от отработанных часов");
    }


}
