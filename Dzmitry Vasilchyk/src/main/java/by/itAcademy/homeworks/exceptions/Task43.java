package by.itAcademy.homeworks.exceptions;

/**Написать код, который выбрасывает NullPointerException.
 * Написать обработчик этого исключения и вывести на экран сообщение,
 * которое будет содержать описание данного исключения.**/

public class Task43 {
    public static String exception(Object obj) {
        String rez = "";
            try {
                obj.hashCode();
                rez="Exception wasn't processed";
            } catch (NullPointerException e) {
                 rez = "Exception was processed. Попытка получить доступ к методу объекта null";
            }
        return rez;
    }
}
