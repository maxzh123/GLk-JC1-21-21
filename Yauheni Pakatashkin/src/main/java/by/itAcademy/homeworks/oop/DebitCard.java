package by.itAcademy.homeworks.oop;

public  class DebitCard extends AbstractCard implements CardsAction{
    private static final boolean DEBIT_CARD = true;
    private double accountBalance;

    public DebitCard(long accountNumber, String cardholderName, boolean international, String nameOfBank, double accountBalance){
        super(accountNumber,cardholderName,international, nameOfBank);
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public void showBalance() {
        System.out.println("Баланс счета " + getAccountBalance());
    }

    @Override
    public void addMoney() {

    }

    @Override
    public void withdrawMoney() {

    }
}
