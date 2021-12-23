package by.itAcademy.homeworks.oop.task33;

public class AlphaBankCard extends CreditCard{
    private final String nameOfBank;
    public AlphaBankCard(String nameOfUser, long account, double accountAmount) {
        super(nameOfUser, account, accountAmount);
        this.nameOfBank = "AlphaBank";


    }

    public void greetingFromBank(){
        System.out.println("Приветствуем Вас в числе наших клиентов :)");

    }

    @Override
    public void registerCard() {            //метод регистрации карточки
        super.registerCard();
        System.out.println("Поздравляю, вы зарегестрировали и активировали карточку со следующими параметрами:\n"
                + "имя банка - " + nameOfBank + ";\n" + "имя владельца счета - " + nameOfUser + ";\n" + "номер счета - " + account);
    }
}
