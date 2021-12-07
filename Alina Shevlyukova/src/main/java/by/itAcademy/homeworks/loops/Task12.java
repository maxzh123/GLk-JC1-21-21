package by.itAcademy.homeworks.loops;

public class Task12 {
    public static void main(String[] args) {
        int f = 1;
        int number = 0;
        while (number < 10) {
                number++;
                f = f * number;
                System.out.println("Факториал " + number + " = " + f);
            }
        }
    }


