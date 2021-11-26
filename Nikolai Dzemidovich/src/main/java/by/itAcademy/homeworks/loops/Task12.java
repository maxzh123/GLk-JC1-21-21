package by.itAcademy.homeworks.loops;

public class Task12 {
    public static void main(String[] args) {
        int number = 1;
        int factorial = 1;
        while (number < 11) {
            factorial = factorial * number;
            System.out.println("Факториал числа " + number + " = " + factorial);
            number++;
        }
    }
}
