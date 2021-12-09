package by.itAcademy.homeworks.oop.Task33BankCards;

/**
 * Задание 33
 * Создать цепочку наследования классов, описывающих банковские карточки. Создать несколько объектов этих классов.
 */

public class Task33 {
    public static void main(String[] args) {
        BankCards bankcard1 = new CreditBankCard(200, "BYN", 1);
        BankCards bankcard2 = new DebitBankCard("BYN,USD,EUR,RUB", 3);
        BankCards bankcard3 = new StudentBankCard("BYN", 5);
        bankcard1.run();
        bankcard2.run();
        bankcard3.run();
    }
}
