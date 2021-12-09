package by.itAcademy.homeworks.operators;

/** Задание 6
 * Создайте метод с одним целочисленным параметром.
 * Метод должен определить, является ли последняя цифра числа семеркой и вернуть boolean значение.
 */

public class Task6 {
    public static void main(String[] args) {
        int number = 1007;
        checkTheSevenAtTheEnd(number);
    }

    public static void checkTheSevenAtTheEnd (int x) {
        if (x % 10 == 7) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
