package by.itAcademy.homeworks.oop.Task34Factory;

public class Foreman extends Manager implements Supervisor, PersonWithTechnicalEducation {
    public Foreman(String name, int age) {
        super("Пятидневка", "Кабинет старшего мастера", "Повременно-премиальная",
                "Старший мастер", "Контракт на 3 года");
        this.name = name;
        this.age = age;
    }

    @Override
    public void toWork() {
        System.out.println("Контроль порядка на участке, выдача заданий мастерам бригад");
    }

    @Override
    public void payroll() {
        super.payroll();
        System.out.println("Оклад + премия");
    }
}