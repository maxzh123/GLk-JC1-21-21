package by.itAcademy.homeworks.objects;

public class CashMachine {
    private int banknote20;
    private int banknote50;
    private int banknote100;

    public CashMachine(int banknote20, int banknote50, int banknote100) {
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
        this.banknote100 = banknote100;
    }

    public int getBalance() {
        return banknote20*20 + banknote50*50 + banknote100*100;
    }

    public void plusMoneyOnTheBalance(int x) {
        if (x != 10 && x != 30 && x%10 == 0) {
            System.out.println("Операция произведена успешно. Пополнение счёта на сумму " + x);
            System.out.println("Ваш текущий баланс: " + (x + this.getBalance()));
        } else {
            System.out.println("Ошибка при выполнении операции.");
            System.out.println("Банкомат принимает только купюры номиналом 20, 50, 100");
        }
    }

    public void minusMoneyOnTheBalance(int x) {
        x = Math.abs(x);
        if (x <= getBalance() && x != 10 && x != 30 && x%10 == 0) {
            System.out.println("Операция произведена успешно.");
            if (x%100 == 0) {
                System.out.println("Выдана сумма:" + x + " = " + x/100 + "*100");
            } else if (x%50 == 0) {
                if (x == 50) {
                    System.out.println("Выдана сумма:" + x + " = 1*50");
                } else System.out.println("Выдана сумма:" + x + " = " + x/100 + "*100," + x%100/50 + "*50");
            } else if (x%100 != 0) {
                if (x%20 == 0 && x < 100) {
                    System.out.println("Выдана сумма:" + x + " = " + x/20 + "*20");
                } else if (x%20 == 0 && x > 100) {
                    System.out.println("Выдана сумма:" + x + " = " + x/100 + "*100," + x%100/20 + "*20");
                } else if (x < 150) {
                    System.out.println("Выдана сумма:" + x + " = 1*50," + (x-50)/20 + "*20");
                } else if (x%100 == 10 || x%100 == 30) {
                    System.out.println("Выдана сумма:" + x + " = " + (x-100)/100 + "*100,1*50," + (x-50)%100/20 + "*20");
                } else System.out.println("Выдана сумма:" + x + " = " + x/100 + "*100,1*50," + (x-50)%100/20 + "*20");
            }
            System.out.println("Ваш текущий баланс: " + (this.getBalance() - x));
        } else if (x > getBalance()) {
            System.out.println("Ошибка при выполнении операции. У вас нет столько денег на балансе");
            System.out.println("Ваш текущий баланс: " + this.getBalance());
        } else System.out.println("Ошибка при выполнении операции. Банкомат выдаёт только купюры номиналом 20, 50, 100");
    }
}
