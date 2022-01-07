package by.itAcademy.homeworks.oop;

public abstract class AbstractCard {
    private long accountNumber;
    private String cardholderName;
    private boolean international;
    private String nameOfBank;

     public AbstractCard(long accountNumber, String cardholderName, boolean international, String nameOfBank){
         this.accountNumber = accountNumber;
         this.cardholderName = cardholderName;
         this.international = international;
         this.nameOfBank = nameOfBank;
     }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public boolean isInternational() {
        return international;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }
}
