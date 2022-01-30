package by.itAcademy.homeworks.oop.task33;

import java.io.IOException;

public class CreditBankCard extends AbstractCard {
    int sumCredit;

    public CreditBankCard (int sumCredit, String currency, int validityPeriod) {
        super("Кредитная карта.");
        this.sumCredit = sumCredit;
        this.currency = currency;
        this.validityPeriod = validityPeriod;
    }

    @Override
    public void registrationNewCard () {
        System.out.println("Оформление кредитной карты сроком на " + validityPeriod + " год(а)/лет.");
        System.out.println("Лимит карты : " + sumCredit + " " + currency);
        System.out.println("Принимаемая валюта: " + currency);
        System.out.println("Пополняйте счёт в конце каждого месяца, иначе карта будет заблокирована.");
    }

    @Override
    public void run() throws IOException {
        System.out.println(getCardName());
        registrationNewCard();
        minusMoney(sumCredit);
    }
}
