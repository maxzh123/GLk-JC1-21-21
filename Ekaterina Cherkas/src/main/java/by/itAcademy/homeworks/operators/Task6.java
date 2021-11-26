package by.itAcademy.homeworks.operators;

public class Task6 {

    static boolean method(int a) {
        if (a % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int k = 369;
        System.out.println(method(k));
    }
}
