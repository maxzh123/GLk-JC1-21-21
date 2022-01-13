package by.itAcademy.homeworks.exceptions;


/**Написать собственное исключение от Exception.
 * Сгенерировать код, который будет выбрасывать его и обрабатывать.
 * Результат работы программы вывести на экран.**/

public class Task44 {
    public static void main(String[] args) throws MyArithmeticException {
        int num[] = {12,24,48};
        int denom[] = {2,0,4};
        for (int i = 0; i < num.length; i++) {
            try {
                if (denom[i] != 0) {
                    System.out.println(num[i] + "/" + denom[i] + " = " + num[i] / denom[i]);
                }
                else {
                    throw new MyArithmeticException("деление на ноль");
                }
            }
            catch (MyArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
