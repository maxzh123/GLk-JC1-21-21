package by.itAcademy.homeworks.loops;

// Задание 16
// Из интервала чисел от 1 до 100 вывести на экран те, которые делятся  на 7 и добавить к ним "Hope!".

public class Task16 {
    public static void main(String[] args) {
        for (int i = 1; i<=100; i++) {
            if (i%7 == 0) {
                System.out.println(i + " Hope!");
            }
        }
    }
}
