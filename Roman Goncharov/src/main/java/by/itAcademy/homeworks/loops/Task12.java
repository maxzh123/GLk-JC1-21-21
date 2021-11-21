package by.itAcademy.homeworks.loops;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("0! = 1");
        int result = 1; // Факториал 0 - равен 1. Это правило.
        int i = 1; // Т.к. факториал 0 мы уже знаем из правила наше первое число в цикле - 1.
        while (i <= 10) {
           result = result * i;
           System.out.println(i + "! = " + result);
           i++;
        }
    }
}