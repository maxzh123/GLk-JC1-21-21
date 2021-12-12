package by.itAcademy.homeworks.operators;

public class Task6 {
    static boolean LastDigit (int a) {
        if (a % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int x = 584;
        System.out.println(LastDigit());
    }

    private static boolean LastDigit() {
        return false;
    }


}
