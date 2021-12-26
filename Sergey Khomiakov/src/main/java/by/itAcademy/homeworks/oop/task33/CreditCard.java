package by.itAcademy.homeworks.oop.task33;

import by.itAcademy.homeworks.regexp.SimpleReader;

public class CreditCard extends AbstractBankCard {

    public CreditCard(String nameOfUser, long account, double accountAmount){
        this.nameOfUser = nameOfUser;
        this.account = account;
        this.accountAmount = accountAmount;
    }



    @Override
    public void withdrawMoney() {                 // переопределяем метод для работы с отрицательным значением
        if (!isFrozen) {
            System.out.println("Введите сумму, которую Вы хотите снять со счет\n");
            int money = SimpleReader.readInt();
            accountAmount-=money;
            getBalance();
        } else {
            System.out.println("Счет заблокирован\n");

        }

    }

    @Override
    public void getBalance() {                  // переопределяем метод для работы с отрицательным значением
        if (isFrozen){
            System.out.println("Счет заблокирован\n");
        } else {
            System.out.println("Счет активен");
            if(accountAmount>=0){
                System.out.println("На вашем счете " + account + " находится " + accountAmount + "$");
            } else { System.out.println("Вы живете за счет банка и вы ему должны " + Math.abs(accountAmount) + "$");}

        }

    }

}
