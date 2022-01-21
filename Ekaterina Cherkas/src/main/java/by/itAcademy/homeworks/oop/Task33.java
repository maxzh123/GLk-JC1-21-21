package by.itAcademy.homeworks.oop;

import java.io.IOException;

/** Задание 33
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих банковские карточки.
 * Иерархия должна иметь хотя бы три уровня.
 */
public class Task33 {
    public static void main(String[] args) throws IOException {
        BankCards card1 = new DebitBankCard("BYN,USD,EUR,RUB", 4);
        BankCards card2 = new CreditBankCard(1000, "BYN", 2);
        BankCards card3 = new VirtualBankCard("RUB", 3);
        card1.run();
        card2.run();
        card3.run();
    }
}