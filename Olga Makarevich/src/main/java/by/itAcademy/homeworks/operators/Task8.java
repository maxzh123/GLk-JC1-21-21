package by.itAcademy.homeworks.operators;

// Задать целое число в виде переменной, это число – сумма денег в рублях.
// Вывести это число на экран, добавив к нему слово «рублей» в правильном падеже

public class Task8 {
    public static void main(String[] args) {
        int a;
        a = (int) (Math.random() * 100000);
        if (a % 10 == 1) {
            System.out.println(a + " рубль");
        } else if (a % 10 == 2 | a % 10 == 3 | a % 10 == 4) {
            System.out.println(a + " рубля");
        } else if (a % 10 == 5 | a % 10 == 6 | a % 10 == 7 | a % 10 == 8 | a % 10 == 9 | a % 10 == 0) {
            System.out.println(a + " рублей");
        }
    }
}

// переделать с методом
