package by.itAcademy.homeworks.oop.task33;

import by.itAcademy.homeworks.regexp.SimpleReader;

public abstract class AbstractBankCard implements BehaviorForCard {
    protected boolean isFrozen = true;
    protected String nameOfUser;
    protected long account;
    protected double accountAmount;

    @Override
    public void getBalance() {                  //метод получения информации по счету
        if (isFrozen){
            System.out.println("Счет заблокирован\n");
        } else {
            System.out.println("Счет активен");
            System.out.println("На вашем счете " + account + " находится " + accountAmount + "$\n");
        }

    }

    @Override
    public void addMoney() {                   //метод пополнения счета
        if (!isFrozen) {
            System.out.println("Введите сумму, которую Вы хотите положить на счет\n");
            int money = SimpleReader.readInt();
            if (money > 0) {
                accountAmount += money;
                getBalance();
            } else {
                System.out.println("Операция завершилась неудачно\n");
            }
        } else {
            System.out.println("Счет заблокирован\n");

        }
    }

    @Override
    public void withdrawMoney() {               //метод получения денег со счета
        if (!isFrozen) {
            System.out.println("Введите сумму, которую Вы хотите снять со счет\n");
            int money = SimpleReader.readInt();
            if (money<=accountAmount){
                accountAmount -= money;
                getBalance();
            } else{
                System.out.println("Операция завершилась неудачно, на счете недостаточно средств\n");}
        } else {
            System.out.println("Счет заблокирован\n");

        }

    }

    @Override
    public void registerCard() {            //метод регистрации карточки
        isFrozen = false;
        System.out.println("Поздравляю, вы зарегестрировали и активировали карточку со следующими параметрами:\n"
                + "имя владельца счета - " +  nameOfUser + ";\n" + "номер счета - " + account);
    }

    @Override
    public boolean setAccountStatus() {         //меняет текущий статус карточки на противоположный при вызове
        return !isFrozen;
    }
}
