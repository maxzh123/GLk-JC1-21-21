package by.itAcademy.homeworks.loops;

// Вычислить факториал целых чисел от 0 до 10 с помощью цикла while

public class Task12 {
    public static void main(String[] args) {
        int i = 1;
        int a = 1;
       while (i < 11) {
           a = i * a;
           i++;
    }
        System.out.println("Факториал целых чисел от 1 до 10 = " + a);}
    }
