package by.itAcademy.homeworks.objects;

/** Создать класс описывающие Банкомат. Набор купюр, находящихся в
 банкомате, должен задаваться тремя свойствами: количеством купюр номиналом 20,
 50, 100. Сделать методы для добавления денег в банкомат. Сделать метод,
 снимающий деньги. С клавиатуры передается сумма денег. На экран – булевское
 значение (операция удалась или нет). При снятии денег метод должен выводить на
 экран каким количеством купюр и какого номинала выдается сумма. Создать
 конструктор с тремя параметрами – количеством купюр. Прочее – на ваше
 усмотрение.
 */

public class Task25 {
    public static void main(String[] args) {
        SimpleATM ATM = new SimpleATM(5, 5, 0);
        ATM.getSomeMoneyFromATM();
        ATM.getBalanceInATM();
        ATM.getSomeMoneyFromATM();
        ATM.getBalanceInATM();

        ATM.addMoneyToATM();

        ATM.getSomeMoneyFromATM();
        ATM.getBalanceInATM();

    }
}
