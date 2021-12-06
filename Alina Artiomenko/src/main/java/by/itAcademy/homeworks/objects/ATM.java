package by.itAcademy.homeworks.objects;

public class ATM {
    int nominalValue20;
    int nominalValue50;
    int nominalValue100;
    int moneyBalance = 0;
    boolean transactionOK = false;

    //конструктор
    public ATM(int nominalValue20, int nominalValue50, int nominalValue100){
        this.nominalValue20 = nominalValue20;
        this.nominalValue50 = nominalValue50;
        this.nominalValue100 = nominalValue100;
    }

    //добавление денег
    public String addMoney(int addMon){
        String msg = "";
        if (((((addMon % 100) % 50) % 20) == 0) && (addMon > 0)){
            nominalValue100 = nominalValue100 + addMon / 100;
            nominalValue50 = nominalValue50 + (addMon % 100) / 50;
            nominalValue20 = nominalValue20 + ((addMon % 100) % 50) / 20;
            msg = "Зачислено " +  addMon;
        } else {
            msg = "Деньги не зачислены! Принемаются только деньги номиналом 20, 50, 100!";
        }
        return msg;
    }

    //достаточно денег
    public boolean enoughMoney (int getMoney){
        if ((getMoney <= moneyBalance) && (getMoney != 0) && (getMoney > 0)){
            transactionOK = true;
        }
        return transactionOK;
    }

    //снятие денег
    public String withdrawalMoney(int getMoney){
        String msg = "";
        if (((getMoney % 100) % 50) % 20 == 0){
            int count100 = getMoney / 100;
            nominalValue100 = nominalValue100 - count100;
            int count50 = (getMoney % 100) / 50;
            nominalValue50 = nominalValue50 - count50;
            int count20 = ((getMoney % 100) % 50) / 20;
            nominalValue20 = nominalValue20 - count20;
            msg = "Выдано: " +  count100 + " * 100, " + count50 + " * 50, " + count20 + " * 20";
        } else {
            msg = "Увы! Нет необходимых купюр для выдачи денег";
        }
        return msg;
    }

    //сумма в ATM
    public int getMoneyBalance(){
        moneyBalance = nominalValue20 * 20 + nominalValue50 * 50 + nominalValue100 * 100;
        return moneyBalance;
    }
}
