package by.itAcademy.homeworks.oop;

public abstract class CreditCard extends AbstractCard implements CardsAction{
    private static final boolean CREDIT_CARD = true;
    private double accountBalance;
    private double creditLimit;

    public CreditCard(long accountNumber, String cardholderName, boolean international,String nameOfBank, double accountBalance, double creditLimit ){
        super(accountNumber,cardholderName,international,nameOfBank);
        this.accountBalance = accountBalance;
        this.creditLimit = creditLimit;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public void showBalance() {
        System.out.println("Баланс счета"+getAccountBalance()+getCreditLimit());
    }

    @Override
    public void addMoney() {

    }

    @Override
    public void withdrawMoney() {

    }
}
