package by.itAcademy.homeworks.oop.Task33BankCards;

public class StudentBankCard extends DebitBankCard{
    private String cardName = "Студенческая карта.";

    public StudentBankCard(String currency, int cardTerm){
        super(currency,cardTerm);
    }

    @Override
    public String getCardName(){
        return cardName;
    }

    @Override
    public void registrationNewCard () {
        System.out.println("Вы удачно оформили студенческую карту сроком на " + cardTerm + " год(а)/лет.");
        System.out.println("Принимаемая валюта: " + currency);
    }

    @Override
    public void run(){
        System.out.println(getCardName());
        registrationNewCard();
    }
}
