package by.itAcademy.homeworks.loops;

// Для целых чисел, которые делятся на 7 в диапазоне от 1 до 100, вывести на экран строку “Hope!”.

public class Task16 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100 + 1);
        for (a = 1; a <= 100; a++) {
            if (a % 7 == 0) {
                System.out.println( a  + " =" + " Hope!");
            }
        }
    }
}
