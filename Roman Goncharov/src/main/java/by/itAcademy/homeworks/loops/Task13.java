package by.itAcademy.homeworks.loops;

// Задание № 13
// Вычислить произведение чисел от 1 до 25.


public class Task13 {
    public static void main(String[] args) {
        int i = 1;
        double result = 1;
        do {
            result = result * i;
            i++;
        } while (i <= 25);
        System.out.println("Произведение чисел от 1 до 25 равно " + result);
    }
}
