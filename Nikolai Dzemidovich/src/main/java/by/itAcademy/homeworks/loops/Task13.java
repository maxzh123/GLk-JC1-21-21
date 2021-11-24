package by.itAcademy.homeworks.loops;

public class Task13 {
    public static void main(String[] args) {
        double number = 1;
        double count = 1;
        do {
            count = count * number;
            number++;
        } while (number <= 25);
        System.out.println("Произведение от 1 до 25 = " + count);
    }
}
