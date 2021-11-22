package by.itAcademy.homeworks.operators;

public class Task8 {
    public static void main(String[] args) {
        int money = 60;
        if (money >= 0) {
            if (money % 100 >= 10 && money % 100 <= 19) {
                System.out.println(money + " рублей.");
            } else {
                switch (money % 10) {
                    case 1:
                        System.out.println(money + " рубль.");
                        break;
                    case 2:
                    case 3:
                    case 4:
                        System.out.println(money + " рубля.");
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 0:
                        System.out.println(money + " рублей.");
                }
            }
        } else {
            System.out.println("У Вас отрицательный баланс");
        }
    }
}