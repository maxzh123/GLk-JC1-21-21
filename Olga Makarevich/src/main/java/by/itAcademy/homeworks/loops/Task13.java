package by.itAcademy.homeworks.loops;

// Вычислить произведение чисел от 1 до 25 с помощью цикла do while.

public class Task13 {
    public static void main(String[] args) {
        long start = 1;
        long end = 25;
        System.out.println("Произведение чисел от 1 до 25 = " + multiplication(start, end));
    }

    static long multiplication (long a, long b) { // результат неправильный
        long result = 1;
        while (a <= b) {
            result = a * result;
            a++;
        }
        return result;
    }
}

//15 511 210 043 330 985 984 000 000