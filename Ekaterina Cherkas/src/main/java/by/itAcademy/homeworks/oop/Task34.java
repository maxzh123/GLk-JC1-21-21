package by.itAcademy.homeworks.oop;

/** Задание 34
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих должностную структуру на заводе.
 * Реализовать методы по начислению зарплаты в зависимости от должности (почасовая, процентная,
 * смешанная). Иерархия должна иметь хотя бы три уровня.
 */

public class Task34 {
    public static void main(String[] args) {
        Engineer e1 = new Engineer("Инженер", "Вадим", 110, 180);
        e1.getSalary();
        e1.getInfo();

        Logistician l1 = new Logistician("Логист", "Оксана", 120, 180);
        l1.getSalary();
        l1.getInfo();

        Director d1 = new Director("Директор завода", "Игорь Афанасьев");
        d1.getSalary();
        d1.getInfo();
    }
}
