package by.itAcademy.homeworks.oop.Task34Factory;

public class LoaderDriver extends Worker {
    public LoaderDriver(String name, int age) {
        super("2 через 2", "Погрузчик", "Повременно-премиальная",
                "Водитель погрузчика", "Бессрочный трудовой");
        this.name = name;
        this.age = age;
    }

    @Override
    public void toWork() {
        System.out.println("Разгрузка готовой продукции с оборудования, загрузка заготовки на оборудование");
    }

    @Override
    public void payroll() {
        super.payroll();
        System.out.print("Оклад + премия\n");
    }
}