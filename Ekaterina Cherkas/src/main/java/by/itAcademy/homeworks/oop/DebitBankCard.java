package by.itAcademy.homeworks.oop;

import java.io.IOException;
import java.util.Objects;

public class DebitBankCard extends AbsrtactCard {
    public DebitBankCard (String currency, int validityperiod) {
        super("Дебетовая карта.");
        this.currency = currency;
        this.validityperiod = validityperiod;
    }

    @Override
    public void registrationNewCard () {
        System.out.println("Вы удачно оформили дебетовую карту сроком на " + validityperiod + " год(а)/лет.");
        System.out.println("Принимаемая валюта: " + currency);
    }

    @Override
    public void plusMoney(double balance) throws IOException {
        System.out.println("Выберите валюту для пополнения счёта (" + currency + ("):"));
        String cur = reader.readLine();
        if (Objects.equals(cur, "BYN") || Objects.equals(cur, "USD") || Objects.equals(cur, "EUR") || Objects.equals(cur, "RUB")) {
            System.out.println("Введите сумму для пополнения счёта:");
            double sum = Integer.parseInt(reader.readLine());
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
    public void run() throws IOException {
        System.out.println(getCardName());
        registrationNewCard();
        plusMoney(balance);
    }
}