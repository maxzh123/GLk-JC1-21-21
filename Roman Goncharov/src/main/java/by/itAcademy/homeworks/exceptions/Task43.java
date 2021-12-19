package by.itAcademy.homeworks.exceptions;

/**
 * Задание 43
 * Написать код, который выбрасывает NullPointerException. Написать обработчик этого исключения
 * и вывести на экран описание исключения.
 */

public class Task43 {
    public static void main(String[] args) {
        Object newObject = null;
        exceptionHandler(newObject);
    }

    public static void exceptionHandler (Object obj){
        try {
            obj.toString();
        } catch (NullPointerException e){
            e.printStackTrace();
            System.out.println("Ошибка. Этот объект нельзя преобразовать в строку.");
            System.out.println("Вы удачно обработали исключение.");
        }
    }
}
