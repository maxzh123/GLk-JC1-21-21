package by.itAcademy.homeworks.loops;

// Найти среди чисел от 50 до 70 второе простое число (число называют простым, если оно делится без остатка
// только на 1 и себя) и завершить цикл с использованием break.

public class Task15 {
    public static void main(String[] args) {
        int numbers = 50;
        System.out.println(foundOfNaturalNumber(numbers));
    }

    public static int foundOfNaturalNumber(int numbers) {
        int a = 1;
        int count = 0;
        for (a = 1; a <= 70; a++) {
            if (numbers / a == numbers) {
                if (numbers / a == 1) {
                    count++;
                }
            }
            numbers++;
            if (count == 2) {
                System.out.println(numbers);
            }
        }
    }
}
