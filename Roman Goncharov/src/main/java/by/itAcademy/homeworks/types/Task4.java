package by.itAcademy.homeworks.types;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();
        System.out.println(getExpression(a,b));
    }

    public static int getExpression(int a, int b) {
        return a + b + a * b;
    }
}
