package by.itAcademy.homeworks.oop.Task33BankCards;

import java.util.Scanner;

abstract class AbstractBankCard implements BankCards {
    protected String cardName; // Название карты
    protected int cardTerm; // Срок действия карты
    protected String currency; // Валюта, с которой работает карта
    protected double balance = 0; // Баланс карты
    Scanner console = new Scanner(System.in);

    public String getCardName() {
        return cardName;
    }

    public void registrationNewCard(){}

    public void minusMoney(double balance) {
        System.out.println("Сколько денег вы хотите снять?");
        double sum = console.nextInt();
        if (sum <= balance) {
            System.out.println("Пожалуйста, возьмите ваши деньги.");
            System.out.println("Ваш текущий баланс: " + (balance - sum));
        } else System.out.println("У вас нет столько денег на балансе.");
    }

    public void plusMoney(double balance) {
        System.out.println("Сколько денег положить на счёт?");
        double sum = console.nextInt();
        System.out.println("Операция завершена успешно.");
        System.out.println("Ваш текущий баланс:" + (balance + sum));
    }

    public void run(){
        System.out.println(getCardName());
        registrationNewCard();
        plusMoney(balance);
        minusMoney(balance);
    }
}
