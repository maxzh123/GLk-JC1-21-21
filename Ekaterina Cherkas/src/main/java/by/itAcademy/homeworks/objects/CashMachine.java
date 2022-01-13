package by.itAcademy.homeworks.objects;

public class CashMachine {
    int banknote20;
    int banknote50;
    int banknote100;
    int moneyBalance = 0 ;
    boolean transactionOK = false;

    public CashMachine (int banknote20 ,int banknote50,int banknote100){
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }
    public void addMoney(int addMon){
        if (((((addMon % 100) % 50) % 20) == 0) && (addMon > 0)){
            banknote100 = banknote100 + addMon / 100;
            banknote50 = banknote50 + (addMon % 100) / 50;
            banknote20 = banknote20 + ((addMon % 100) % 50) / 20;
            System.out.println("Операция выполнена успешно " +  addMon);
        } else {
            System.out.println("Произошла ошибка.Принимаются купюры номиналом 20, 50, 100!");
        }
    }

    public boolean enoughMoney (int getMoney){
        if ((getMoney <= moneyBalance) && (getMoney != 0)){
            transactionOK = true;
        }
        return transactionOK;
    }

    public String conclusionMoney(int getMoney){
        String message ;
        if (((getMoney % 100) % 50) % 20 == 0){
            int count100 = getMoney / 100;
            banknote100 = banknote100 - count100;
            int count50 = (getMoney % 100) / 50;
            banknote50 = banknote50 - count50;
            int count20 = ((getMoney % 100) % 50) / 20;
            banknote20 = banknote20 - count20;
            message = "Выдано: " +  count100 + " * 100, " + count50 + " * 50, " + count20 + " * 20";
        } else {
            message = "Нет необходимых купюр для выдачи денег";
        }
        return message;
    }

    public int getMoneyBalance(){
        moneyBalance = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
        return moneyBalance;
    }
}

