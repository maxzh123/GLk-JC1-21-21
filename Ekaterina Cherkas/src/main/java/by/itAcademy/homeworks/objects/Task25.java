package by.itAcademy.homeworks.objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/** Задание 25
 * Создать класс, описывающий Банкомат. Набор купюр, находящихся в банкомате, должен задаваться тремя
 * свойствами: количеством купюр номиналом 20, 50, 100. Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги. С клавиатуры передается сумма денег. На экран – булевское
 * значение (операция удалась или нет). При снятии денег метод должен выводить на экран каким
 * количеством купюр и какого номинала выдается сумма. Создать конструктор с тремя
 * параметрами – количеством купюр. Прочее – на ваше усмотрение.
 */

public class Task25 {
    public static void main(String[] args) throws IOException {
        CashMachine balance = new CashMachine(50,10,0);
        System.out.println("На вашем балансе: " + balance.getMoneyBalance());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int getMoney = Integer.parseInt(reader.readLine());
        System.out.println("Сумма для снятия: ");
        System.out.println(balance.enoughMoney(getMoney));
        System.out.println(balance.conclusionMoney(getMoney));
        System.out.println("На вашем балансе: " + balance.getMoneyBalance());
        System.out.println();

        System.out.println("Сумма которую необходимо зачислить: ");
        int addMoney = Integer.parseInt(reader.readLine());
        System.out.println(balance.enoughMoney(getMoney));
        balance.addMoney(addMoney);
        System.out.println("На вашем балансе: " + balance.getMoneyBalance());
    }
}
