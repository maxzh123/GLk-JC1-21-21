package by.itAcademy.homeworks.loops;

public class Task13 {
    public static void main(String[] args) {
        double number = 1;
        double count = 1;
        while (number <= 25) {
            count = count * number;
            number++;
        }
        System.out.println("Произведение от 1 до 25 = " + count);
    }
}
