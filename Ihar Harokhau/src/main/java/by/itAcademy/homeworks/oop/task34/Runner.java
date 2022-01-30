package by.itAcademy.homeworks.oop.task34;

/**
 * Задание 34
 * Создать цепочку наследования классов,
 * описывающих должностную структуру на заводе.
 * Реализовать методы по начислению зарплаты
 * в зависимости от должности (почасовая, процентная, смешанная).
 */

public class Runner {
    public static void main(String[] args) {
        Engineer e1 = new Engineer("Инженер", "Максим", 110, 180);
        e1.getSalary();
        e1.getInfo();

        Logistician l1 = new Logistician("Логист", "Петр", 120, 180);
        l1.getSalary();
        l1.getInfo();

        Director d1 = new Director("Директор завода", "Екатерина");
        d1.getSalary();
        d1.getInfo();
    }
}
