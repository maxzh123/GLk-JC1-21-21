package by.itAcademy.homeworks.oop;

/**
 * Создать цепочку наследования (минимум 3 звена) классов, описывающих банковские карточки.
 * Иерархия должна иметь хотя бы три уровня.
 */
public class Task33 {
   public static void main(String[] args) {
      BankCard card1 = new BankCard(1111, "Alexey Ivanov", true, "Belarusbank",true, false, 33.50, 10.00);
      BankCard card2 = new BankCard(2222, "Ivan Alexeev", false, "AlphaBank", false, true, 10.00, 0);

      card1.showBalance();
      card2.showBalance();
   }
}
