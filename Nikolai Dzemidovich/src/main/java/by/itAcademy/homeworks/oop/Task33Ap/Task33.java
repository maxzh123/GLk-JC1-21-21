package by.itAcademy.homeworks.oop.Task33Ap;

public class Task33 {
    public static void main(String[] args) {
        //Нужна помощь с setPassword. Он по какой-то причине сразу выдает что некорректный пароль, не дожидаясь ввода с клавиатуры.

        MasterCard card1 = new MasterCard(15654654);
        Visa card2 = new Visa(897846352);

        card1.getCardInformation();
        card1.deposit();
        card1.withdraw();
        card1.setPassword();
        card1.getCardInformation();

        card2.getCardInformation();
        card2.deposit();
        card2.withdraw();
        card2.setPassword();
        card2.getCardInformation();
    }
}
