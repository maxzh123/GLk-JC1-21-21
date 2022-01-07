package by.itAcademy.homeworks.oop.Task34Factory;

public class WireMaker extends Worker {
    public WireMaker(String name, int age) {
        super("2 через 2", "Волочильный стан", "Сдельно-премиальная",
                "Волочильщик проволки", "Бессрочный трудовой");
        this.name = name;
        this.age = age;
    }

    @Override
    public void toWork() {
        System.out.println("Изготовление продукции на волочильных станах");
    }

    @Override
    public void payroll() {
        super.payroll();
        System.out.print("Количество изготовленной продукции + премия\n");
    }
}