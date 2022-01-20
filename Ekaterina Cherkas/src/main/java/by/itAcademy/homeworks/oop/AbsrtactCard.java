package by.itAcademy.homeworks.oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class AbsrtactCard implements BankCards {
    final private String cardName;
    protected int validityperiod;
    protected String currency;
    protected double balance = 0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    protected AbsrtactCard (String cardName){
        this.cardName = cardName;
    }

    public String getCardName() {
        return cardName;
    }

    public void registrationNewCard(){}

    public void minusMoney(double balance) throws IOException {
        System.out.println("Введите сумму для снятия");
        double sum = Integer.parseInt(reader.readLine());
        if (sum <= balance) {
            System.out.println("Выдача денег.");
            System.out.println("Ваш текущий баланс: " + (balance - sum));
        } else System.out.println("Отказано.На балансе нет данной суммы");
    }

    public void plusMoney(double balance) throws IOException {
        System.out.println("Введите сумму для снятия");
        double sum = Integer.parseInt(reader.readLine());
        System.out.println("Операция завершена успешно.");
        System.out.println("Ваш текущий баланс:" + (balance + sum));
    }

    public void run() throws IOException {
        System.out.println(getCardName());
        registrationNewCard();
        plusMoney(balance);
        minusMoney(balance);
    }
}
