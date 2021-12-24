package by.itAcademy.homeworks.oop.Task33Ap;

import by.itAcademy.homeworks.types.MyReadHelper;

public abstract class Bills implements OperationsWithCards {

    protected long cardNumber;   // Номер карты
    protected String password;              // Пароль от карты
    protected int account;               // Сумма на счете


    public void getCardInformation() {
        System.out.println("Номер карты - " + cardNumber + "\nТекущий пароль -" + getPassword() + "\nТекущий счет - " + getAccount());
    }

    public void setPassword() {
        String newPassword = MyReadHelper.readLine("Введите новый пароль, состоящий из 4 цифр:");
        if (newPassword.length() < 5 && newPassword.length() > 3) {
            this.password = newPassword;
        } else {
            System.out.println("Введен не корректный пароль");
        }

    } public String getPassword(){
        return this.password;
    }
    public long getAccount(){
        return this.account;
    }

    public void deposit() {
        long sum = MyReadHelper.readInt("Введите сумму зачисления :");
        if (sum > 0) {
            this.account += sum;
            System.out.println("Операция прошла успешно, сумма баланса = " + this.account);
        } else {
            System.out.println("Введена некорректная сумма!");
        }

    }

    public void withdraw() {
        long sum = MyReadHelper.readInt("Введите сумма снятия :");
        if (this.account >= sum) {
            this.account -= sum;
            System.out.println("Операция прошла успешно, сумма баланса = " + this.account);
        } else {
            System.out.println("Введена некорректная сумма!");
        }
    }
}