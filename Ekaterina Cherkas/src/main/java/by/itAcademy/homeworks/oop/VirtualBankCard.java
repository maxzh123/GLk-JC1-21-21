package by.itAcademy.homeworks.oop;

public class VirtualBankCard extends DebitBankCard{
     private final String cardName = "Студенческая карта.";

    public VirtualBankCard(String currency, int validityperiod){
        super(currency,validityperiod);
    }

    @Override
    public String getCardName(){
        return cardName;
    }

    @Override
    public void registrationNewCard () {
        System.out.println("Вы удачно оформили студенческую карту сроком на " + validityperiod + " год(а)/лет.");
        System.out.println("Принимаемая валюта: " + currency);
    }

    @Override
    public void run(){
        System.out.println(getCardName());
        registrationNewCard();
    }

}
