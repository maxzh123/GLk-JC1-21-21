package by.itAcademy.homeworks.operators;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int r = console.nextInt();
        if (r*2 >= Math.sqrt(a*a + b*b)) {
            System.out.println("Картонка радиусом "+ r + " полностью закрывает прямоугольное отверстие " +
                    "размерами a=" + a + " и b=" + b);
        } else {
            System.out.println("Картонка радиусом "+ r + " не закрывает прямоугольное отверстие " +
                    "размерами a=" + a + " и b=" + b);
        }
    }
}
