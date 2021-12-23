package by.itAcademy.homeworks.objects;

/**
 * Задание 25
 * Создать класс, описывающий банкомат. Класс хар-ся 3-мя пар-ми: кол-вом купюр номиналом 20,50,100.
 * Сделать методы для добавления и снятия денег. При снятии денег метод должен выводить на экран каким
 * кол-вом купюр и какого номинала выдана сумма.
 */

public class Task25 {
    public static void main(String[] args) {
        CashMachine balance = new CashMachine(5, 2, 4);
        int money = 0; // Переменная нужна для запуска метода. В методе будет переопределена на вводимую с клавиатуры сумму.
        balance.transactions(money, balance.getBalance());
    }
}

