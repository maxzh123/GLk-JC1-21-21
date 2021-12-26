package by.itAcademy.homeworks.exceptions;

public class Task45 {
    public static void main(String[] args) {

        try {
            System.out.println(Division(10, 0));
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("Обрабатываем Орифметическое исключение РанТаймом");
        }
    }

    public static double Division(int a, int b) throws ArithmeticException {

        return a / b;
    }
}
