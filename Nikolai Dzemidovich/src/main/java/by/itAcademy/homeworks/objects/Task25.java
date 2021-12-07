package by.itAcademy.homeworks.objects;

public class Task25 {
    //Метод с буленом у меня получился рудементарным.
    public static void main(String[] args) {
        CashMachine atm = new CashMachine(50,100,100);

        System.out.println("Баланс банкомата " + atm.getAtmBalance());
        System.out.println("Баланс пользователя " + atm.getUserBalance());

        System.out.println(atm.toWithdrawMoney());
        System.out.println(atm.toCheckWithdraw());

        System.out.println(atm.toDepositMoney());
        System.out.println(atm.toCheckDeposit());

        System.out.println("Баланс банкомата " + atm.getAtmBalance());
        System.out.println("Баланс пользователя " + atm.getUserBalance());


    }
}
