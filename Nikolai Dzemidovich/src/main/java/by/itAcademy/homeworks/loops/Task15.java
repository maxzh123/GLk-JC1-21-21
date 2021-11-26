package by.itAcademy.homeworks.loops;

public class Task15 {
    public static void main(String[] args) {

        int count = 0;

        for (int a = 50; a < 71; a++) {

            if (a % 2 != 0 && a % 3 != 0 && a % 4 != 0 && a % 5 != 0 && a % 6 != 0 && a % 7 != 0 && a % 8 != 0 && a % 9 != 0)
                count++;

            if (count == 2) {
                System.out.println("Второе натуральное число = " + a);
                break;
            }
        }
    }
}
