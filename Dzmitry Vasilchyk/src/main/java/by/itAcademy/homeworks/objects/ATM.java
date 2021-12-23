package by.itAcademy.homeworks.objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATM {
    int nominal20;
    int nominal50;
    int nominal100;
    int balance, cash;
    String cod;
    boolean transactionOK = false;

    ATM(int nominal20, int nominal50, int nominal100) {
        this.nominal20 = nominal20;
        this.nominal50 = nominal50;
        this.nominal100 = nominal100;
    }

    public void getBalance() {
        balance = nominal20 * 20 + nominal50 * 50 + nominal100 * 100;
        System.out.println("У Вас на балансе: " + balance);
    }

    //добавление денег
    public void addMoney() throws IOException {
        System.out.print("Введите сумму для зачисления: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cash = Integer.parseInt(reader.readLine());
        if (((((cash % 100) % 50) % 20) == 0) && (cash > 0)) {
            nominal100 = nominal100 + cash / 100;
            nominal50 = nominal50 + (cash % 100) / 50;
            nominal20 = nominal20 + ((cash % 100) % 50) / 20;
            System.out.println("Зачислено " + cash);
            System.out.println("У Вас на счету " + (balance + cash));
            balance += cash;
        } else {
            System.out.println("Банкомат принимает только купюры номиналом 20, 50, 100!");
        }
    }

    public void getMoney() throws IOException {
        System.out.print("Введите сумму для снятия: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int cash1 = Integer.parseInt(reader.readLine());
        int[] nominal = {20, 50, 100};
        int[] count = new int[nominal.length];
        int index = nominal.length - 1;

        if (cash1 <= 0 || cash1 > balance) {
            System.out.println("Такую сумму снять невозможно");
            System.out.println("У Вас на счету " + balance);
        } else {
            if ((((cash1 % 100) % 50) % 20) == 0) {
                while (index != -1) {
                    count[index] = cash1 / nominal[index];
                    cash1 %= nominal[index];
                    index--;
                }
                for (int i = 0; i < count.length; i++) {
                    System.out.printf("Номинал в %d руб. = %d шт.\n", nominal[i], count[i]);
                }

            } else {
                System.out.println("К сожалению нет необходимых купюр для выдачи");
            }
        }

    }
}


