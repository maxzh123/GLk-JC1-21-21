package by.itAcademy.homeworks.objects;

//Создать класс описывающие Банкомат.
// Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
// количеством купюр номиналом 20, 50, 100. Сделать методы для добавления денег в банкомат.
// Сделать метод, снимающий деньги. С клавиатуры передается сумма денег.
// На экран – булевское значение (операция удалась или нет).
//При снятии денег метод должен выводить на экран каким количеством купюр и какого номинала выдается сумма.
// Создать конструктор с тремя параметрами – количеством купюр. Прочее – на ваше усмотрение.


public class Task25 {
    public static void main(String[] args) {
        ATM alfa = new ATM("Alfa", "dollars", 10,20,30,3200);
        System.out.println(ATM.addBill());

        ATM bps = new ATM("bps", "byn", 20,50,1,3000);
        System.out.println(ATM.takeBill());
    }

}
