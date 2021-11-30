package by.itAcademy.homeworks.loops;

// Найти среди чисел от 50 до 70 второе простое число (число называют простым, если оно делится без остатка
// только на 1 и себя) и завершить цикл с использованием break.

public class Task15 {
    public static void main(String[] args) {
        int numbers = 50;
        System.out.println(foundOfNaturalNumber(numbers));
    }

    public static foundOfNaturalNumber(int numbers) {
        int a = 1;
        for (numbers = 50; numbers <= 70; numbers++) {
            int count = 0;
            if (numbers % a == numbers && numbers % a == 1) {
                count++;
                a++;
            }
            if (count == 2) {
                return numbers;
                break;
            }
        }
    }
}