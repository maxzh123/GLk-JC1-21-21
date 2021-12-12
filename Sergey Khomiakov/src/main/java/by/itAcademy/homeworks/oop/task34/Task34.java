package by.itAcademy.homeworks.oop.task34;

/** Создать цепочку наследования (минимум 3 звена) классов, описывающих
 * должностную структуру на заводе. Реализовать методы по начислению зарплаты в
 * зависимости от должности (почасовая, процентная, смешанная). Иерархия должна
 * иметь хотя бы три уровня.
 */

public class Task34 {
    public static void main(String[] args) {
        CEO chief = new CEO("Начальник отдела", "Андрей Валентинович");
        Engineer eng1 = new Engineer("Инженер ПТО", "Игорь", 150, 168);
        JuniorEngineer eng2 = new JuniorEngineer("Практикант", "Федя", 100, 168);

        eng1.getSalary();
        chief.getSalary();
        eng2.getSalary();

        eng2.getInfo();


    }
}
