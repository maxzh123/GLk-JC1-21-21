package by.itAcademy.homeworks.types;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        int a = in.nextInt();
        System.out.println("Input second number: ");
        int b = in.nextInt();
        System.out.println("Result = "+operation(a,b));
    }
    public static int operation(int a, int b){
        return a+b+(a*b);
    }
}

