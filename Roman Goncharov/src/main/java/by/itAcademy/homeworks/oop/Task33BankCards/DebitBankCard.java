package by.itAcademy.homeworks.oop.Task33BankCards;

import java.util.Objects;

public class DebitBankCard extends AbstractBankCard{

    public DebitBankCard (String currency, int cardTerm) {
        super("Дебетовая карта.");
        this.currency = currency;
        this.cardTerm = cardTerm;
    }

    @Override
    public void registrationNewCard () {
        System.out.println("Вы удачно оформили дебетовую карту сроком на " + cardTerm + " год(а)/лет.");
        System.out.println("Принимаемая валюта: " + currency);
    }

    @Override
    public void plusMoney(double balance) {
        System.out.println("Выберите валюту для пополнения счёта (" + currency + ("):"));
        String cur = console.nextLine();
        if (Objects.equals(cur, "BYN") || Objects.equals(cur, "USD") || Objects.equals(cur, "EUR") || Objects.equals(cur, "RUB")) {
            System.out.println("Введите сумму для пополнения счёта:");
            double sum = console.nextInt();
            switch (cur) {
                case "BYN":
                    break;
                case "USD":
                    sum *= 2.54;
                    break;
                case "EUR":
                    sum *= 2.89;
                    break;
                case "RUB":
                    sum *= 0.034;
                    break;
            }
            System.out.println("Операция завершена успешно.");
            System.out.println("Ваш текущий баланс: " + (balance + sum) + " BYN");
        } else System.out.println("Ошибка. Карта не принимает такую валюту");
    }

    @Override
    public void run(){
        System.out.println(getCardName());
        registrationNewCard();
        plusMoney(balance);
    }
}
