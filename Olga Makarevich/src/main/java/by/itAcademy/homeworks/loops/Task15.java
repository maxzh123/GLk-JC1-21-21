package by.itAcademy.homeworks.loops;

// Найти среди чисел от 50 до 70 второе простое число (число называют простым, если оно делится без остатка
// только на 1 и себя) и завершить цикл с использованием break.

public class Task15 {
    public static void main(String[] args) {
        int a = 1;
        int numbers = 50;
        while (a <= 70 && numbers <= 70) {
            int b = numbers / a;
            a++;
            if (b == numbers && b == 1) {
                System.out.println(b);
            } else {
                numbers++;
            }
        }
    }
}