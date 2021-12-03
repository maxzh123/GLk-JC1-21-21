package by.itAcademy.homeworks.objects;

/**
 Создать класс, описывающий банкомат. Класс хар-ся 3-мя пар-ми: кол-вом купюр номиналом 20,50,100.
 Сделать методы для добавления и снятия денег. При снятии денег метод должен выводить на экран каким
 кол-вом купюр и какого номинала выдана сумма.
 */

import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        CashMachine balance = new CashMachine(5, 2, 4);
        Scanner console = new Scanner(System.in);
        int transaction = console.nextInt();
            if (transaction > 0) {
                balance.plusMoneyOnTheBalance(transaction);
            } else if (transaction < 0) {
                balance.minusMoneyOnTheBalance(transaction);
            } else System.out.println("Ваш текущий баланс: " + balance.getBalance());
    }
}

