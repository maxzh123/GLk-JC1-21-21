package by.itAcademy.homeworks.objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**Создать класс описывающие Банкомат. Набор купюр, находящихся в банкомате,
 * доллжен задаваться тремя свойствами: количеством купюр номиналом 20, 50, 100.
 * Сделать методы для добавления денег в банкомат. Сделать метод, снимающий деньги.
 * С клавиатуры передается сумма денег. На экран – булевское значение (операция удалась или нет).
 * При снятии денег метод должен выводить на экран каким количеством купюр и какого номинала выдается сумма.
 * Создать конструктор с тремя параметрами – количеством купюр. Прочее – на ваше усмотрение.
 * **/
public class Task25 {
    public static void main(String[] args) throws IOException {
        PIN cod=new PIN();
        cod.pincod();
        ATM money = new ATM(50, 10, 5);
        money.getBalance();
        money.addMoney();
        money.getMoney();
    }
}



