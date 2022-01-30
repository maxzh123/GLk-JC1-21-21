package by.itAcademy.homeworks.oop.task33;

public class VirtualBankCard extends DebitBankCard{
    private final String cardName = "Студенческая карта.";

    public VirtualBankCard(String currency, int validityPeriod){
        super(currency,validityPeriod);
    }

    @Override
    public String getCardName(){
        return cardName;
    }

    @Override
    public void registrationNewCard () {
        System.out.println("Вы удачно оформили студенческую карту сроком на " + validityPeriod + " год(а)/лет.");
        System.out.println("Принимаемая валюта: " + currency);
    }

    @Override
    public void run(){
        System.out.println(getCardName());
        registrationNewCard();
    }

}