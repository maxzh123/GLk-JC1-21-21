package by.itAcademy.homeworks.loops;

public class Task15 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 50; i < 70; i++) {
            if (check(i)) {
                count++;
                System.out.println(i);
                if (count == 2)
                    break;
            }
        }
    }

    private static boolean check(int a) {
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}