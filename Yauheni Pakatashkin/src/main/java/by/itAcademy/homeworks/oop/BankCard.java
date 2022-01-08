package by.itAcademy.homeworks.oop;
//ВОПРОС: КАК ПРОПИСАТЬ ЛОГИКУ СЕТТЕРОВ ЕСЛИ ЕСТЬ 2 ВЗАИМОИСКЛЮЧАЮЩИХ ПОЛЯ
// (ЧТОБЫ НЕЛЬЗЯ БЫЛО ОДНОВРЕМЕННО ПОСТАВИТЬ TRUE ДЛЯ ДЕБЕТОВЫХ И КРЕДИТНЫХ КАРТ?
public class BankCard extends AbstractCard implements CardsAction{
    private boolean creditCard;
    private boolean debitCard;
    private double balance;
    private double creditLimit;

    public BankCard(long accountNumber, String cardholderName, boolean international, String nameOfBank, boolean creditCard, boolean debitCard, double balance,double creditLimit){
        super(accountNumber,cardholderName,international,nameOfBank);
        this.creditCard = creditCard;
        this.debitCard = debitCard;
        this.balance = balance;
        this.creditLimit = creditLimit;

    }

    public boolean getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(boolean creditCard) {
        this.creditCard = creditCard;
    }

    public boolean getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(boolean debitCard) {
        this.debitCard = debitCard;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public void showBalance() {
        if(getCreditCard() & !getDebitCard()){
            double result = getBalance()+getCreditLimit();
            System.out.println("Баланс карты "+result);
        }
        else
            System.out.println("Баланс карты "+getBalance());

    }

    @Override
    public void addMoney() {

    }

    @Override
    public void withdrawMoney() {

    }
}
