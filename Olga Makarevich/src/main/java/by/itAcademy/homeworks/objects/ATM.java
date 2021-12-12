package by.itAcademy.homeworks.objects;
import java.util.Scanner;
//Создать класс описывающие Банкомат.
// Набор купюр, находящихся в банкомате, должен задаваться тремя свойствами:
// количеством купюр номиналом 20, 50, 100. Сделать методы для добавления денег в банкомат.
// Сделать метод, снимающий деньги. С клавиатуры передается сумма денег.
// На экран – булевское значение (операция удалась или нет).
//При снятии денег метод должен выводить на экран каким количеством купюр и какого номинала выдается сумма.
// Создать конструктор с тремя параметрами – количеством купюр. Прочее – на ваше усмотрение.

public class ATM { // Не понимаю как сделать так, чтобы не печатало в консоли return-значение в методах
    String nameOfBank;
    String currency;
    int bill20;
    int bill50;
    int bill100;
    int cashAvailable;

    public ATM(String a, String b, int x, int y, int z, int s) {
        nameOfBank = a;
        currency = b;
        bill20 = x;
        bill50 = y;
        bill100 = z;
        cashAvailable = s; // можно ли так, чтобы сразу считало x+y+z?
    }

    public static void main(String[] args) {
        System.out.println(addBill());
        System.out.println(takeBill());
        ATM Alfa = new ATM ("Alfa", "dollars", 10,20,30,3200);

    }

    public static int addBill() {
        int amountOfMoneyInAccount = (int) (Math.random()*1000);
        System.out.println("Текущее состояние счета: " + amountOfMoneyInAccount);
        Scanner add = new Scanner(System.in);
        System.out.println("Положите купюру номиналом 20, 50 или 100 в купюроприемник");
        int addBill = add.nextInt();
        if (addBill == 20) {
            amountOfMoneyInAccount += 20;
            System.out.println("На счет зачислено 20. На Вашем счете " + amountOfMoneyInAccount);
        } else if (addBill == 50) {
            amountOfMoneyInAccount += 50;
            System.out.println("На счет зачислено 50. На Вашем счете " + amountOfMoneyInAccount);
        } else if (addBill == 100) {
            amountOfMoneyInAccount += 100;
            System.out.println("На счет зачислено 100. На Вашем счете " + amountOfMoneyInAccount);
        } else {
            System.out.println("Положите купюры 20, 50 или 100!");
        }
        return amountOfMoneyInAccount;
    }

    public static int takeBill() {
        Scanner add = new Scanner(System.in);
        System.out.println("Сколько вы хотите снять денег?");
        int takeBill = add.nextInt();
        int cashAvailable = (int) (Math.random() * 1000); // хотелось бы сюда переменную amountOfMoneyInAccount из метода addBill, но я не знаю как
        System.out.println("Текущее состояние счета: " + cashAvailable);
        if (takeBill <= cashAvailable) {
            if ((takeBill >= 100) && (takeBill % 100 == 0)) {
                Scanner bill100 = new Scanner(System.in);
                System.out.println("Какими купюрами Вы хотите снять деньги: 100, 50 или 20?");
                int Bill100 = add.nextInt();
                if (Bill100 == 100) {
                    int a = takeBill / 100;
                    System.out.println("Cо счета снято " + takeBill + " " + a + " купюрами по 100");
                } else if (Bill100 == 50) {
                    int a = takeBill / 50;
                    System.out.println("Cо счета снято " + takeBill + " " + a + " купюрами по 50");
                } else if (Bill100 == 20) {
                    int a = takeBill / 20;
                    System.out.println("Cо счета снято " + takeBill + " " + a + " купюрами по 20");
                }
            } else if ((takeBill >= 50) && (takeBill % 50 == 0)) {
                int Bill50 = takeBill / 50;
                System.out.println("Cо счета снято " + takeBill + " " + Bill50 + " купюрами по 50");
            } else if ((takeBill >= 20) && (takeBill % 20 == 0)) {
                int Bill20 = takeBill / 20;
                System.out.println("Cо счета снято " + takeBill + " " + Bill20 + " купюрами по 20");
            } else if ((takeBill % 100 != 0) && (takeBill % 50 != 0) && (takeBill % 20 != 0)) {
                System.out.println("Введите сумму для снятия, кратную 20, 50 или 100!");
            }
        } else {
            System.out.println("Недостаточно средств на счете!");
        }
        return takeBill;
    }
}