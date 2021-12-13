package by.itAcademy.homeworks.oop.task33;

/** Создать цепочку наследования (минимум 3 звена) классов, описывающих
 * банковские карточки. Иерархия должна иметь хотя бы три уровня.
 */

public class Task33 {
    public static void main(String[] args) {
        AlphaBankCard card1 = new AlphaBankCard("SIARHEI KHAMIAKOU", 4444_6666_1111_2222L,10_000);
        card1.registerCard();
        card1.withdrawMoney();
        card1.addMoney();


    }
}
