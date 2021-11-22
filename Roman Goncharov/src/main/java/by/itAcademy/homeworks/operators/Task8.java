package by.itAcademy.homeworks.operators;

public class Task8 {
    public static void main(String[] args) {
        int rub = 12800;
        if (rub % 10 == 1 && rub % 100 != 11) {
            System.out.println(rub + " Рубль");
        } else if (rub % 10 == 2 && rub % 100 != 12 || rub % 10 == 3 && rub % 100 != 13 || rub % 10 == 4 && rub % 100 != 14) {
            System.out.println(rub + " Рубля");
        } else {
            System.out.println(rub + " Рублей");
        }
    }
}
