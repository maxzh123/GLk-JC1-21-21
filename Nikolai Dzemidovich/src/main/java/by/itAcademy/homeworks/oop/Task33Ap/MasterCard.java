package by.itAcademy.homeworks.oop.Task33Ap;

public class MasterCard extends Bills {

    public MasterCard(int cardNumber) {

        System.out.println("Стандартный пароль = 0000");

        this.cardNumber = cardNumber;
        this.password = "0000";
        this.account = (int) (Math.random() * 1000);
    }
}