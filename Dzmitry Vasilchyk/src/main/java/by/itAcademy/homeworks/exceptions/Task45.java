package by.itAcademy.homeworks.exceptions;

/**Написать метод, который будет возбуждать исключение
 * и обработать это исключение на уровне выше.
 * Результат работы программы вывести на экран.**/

public class Task45 {
    public static void work (Object obj) {
        obj.hashCode();
    }
    public static String exception(Object obj) {
        String rez = "";
        try {
            work(obj);
            rez="Exception wasn't processed";
        } catch (NullPointerException e) {
            rez = "Exception was processed. Попытка получить доступ к методу объекта null";
        }
        return rez;
    }
}
