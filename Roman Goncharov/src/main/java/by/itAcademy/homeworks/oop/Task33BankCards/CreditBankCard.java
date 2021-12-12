package by.itAcademy.homeworks.oop.Task33BankCards;

public class CreditBankCard extends AbstractBankCard{
    int sumCredit;

    @Override
    public String getCardName() {
        cardName = "Кредитная карта.";
        return cardName;
    }

    public CreditBankCard (int sumCredit, String currency, int cardTerm) {
        this.sumCredit = sumCredit;
        this.currency = currency;
        this.cardTerm = cardTerm;
    }

    @Override
    public void registrationNewCard () {
        System.out.println("Вы удачно оформили кредитную карту сроком на " + cardTerm + " год(а)/лет.");
        System.out.println("Лимит карты : " + sumCredit + " " + currency);
        System.out.println("Принимаемая валюта: " + currency);
        System.out.println("Не забывайте пополнять счёт в конце каждого месяца, иначе карта будет заблокирована.");
    }

    @Override
    public void run() {
        System.out.println(getCardName());
        registrationNewCard();
        minusMoney(sumCredit);
    }
}
