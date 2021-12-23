package by.itAcademy.homeworks.objects;

import by.itAcademy.homeworks.types.MyReadHelper;

import java.util.Random;

public class CashMachine {

    private int bill20;
    private int bill50;
    private int bill100;
    private int atmBalance;
    private int userBalance;
    private int deposit;
    private int withdraw;
    private boolean check;

    public CashMachine(int bill20, int bill50, int bill100) {
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
    }

    public int getAtmBalance() {
        atmBalance = bill20 * 20 + bill50 * 50 + bill100 * 100;
        return atmBalance;
    }

    public int getUserBalance() {

        Random scr = new Random();
        if (userBalance == 0) {
            for (int i = 0; i >= 0; i++) {
                userBalance = scr.nextInt(10000);

                if ((userBalance % 20 == 0 || userBalance % 50 == 0 || userBalance % 100 == 0) && userBalance > 0)
                    break;
            }
        }
        return userBalance;
    }

    public String toDepositMoney() {

        String tmp = "";
        deposit = MyReadHelper.readInt("Внесите значение для пополнения; допустимый номинал для внесения 20, 50, 100 :");

        if ((deposit % 20 == 0 || deposit % 50 == 0 || deposit % 100 == 0) && deposit > 0) {
            bill100 += (deposit / 100);
            bill50 += ((deposit % 100) % 50);
            bill50 += (((deposit % 100) % 50) / 20);
            userBalance += deposit;
            tmp = "Операция прошла успешно, к зачислению : " + deposit + "." + " Ваш баланс составляет = " + userBalance;
        } else {
            tmp = "Ошибка транзакции";
        }

        return tmp;
    }

    public String toWithdrawMoney() {

        String tmp = "";
        int count100, count50, count20;
        withdraw = MyReadHelper.readInt("Внесите значение для снятия; допустимый номинал для внесения 20, 50, 100 :");

        if ((getAtmBalance() >= userBalance) && (userBalance >= withdraw) && (withdraw % 20 == 0 || withdraw % 50 == 0 || withdraw % 100 == 0) && (withdraw > 0)) {
            count100 = withdraw / 100;
            count50 = (withdraw % 100) / 50;
            count20 = ((withdraw % 100) % 50) / 20;
            bill100 -= count100;
            bill50 -= count50;
            bill20 -= count20;
            userBalance -= withdraw;
            tmp = "Выдано " + count100 + " наминалом 100, " + count50 + " наминалом 50, " + count20 + " наминалом 20." + " Сумма снятия " + withdraw + " Текущий баланс " + userBalance;
        } else {
            tmp = "Ошибка транзакции";
        }
        return tmp;
    }

    public boolean toCheckDeposit() {
        if ((deposit % 20 == 0 || deposit % 50 == 0 || deposit % 100 == 0) && deposit > 0) {
            check = true;
        }
        return check;
    }

    public boolean toCheckWithdraw() {
        if ((getAtmBalance() >= userBalance) && (userBalance >= withdraw) && (withdraw % 20 == 0 || withdraw % 50 == 0 || withdraw % 100 == 0) && (withdraw > 0)) {
            check = true;
        }
        return check;
    }

}
