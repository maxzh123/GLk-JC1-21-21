package by.itAcademy.homeworks.exceptions;

// Написать код, который выбрасывает NullPointerException.
// Написать обработчик этого исключения и вывести на экран сообщение, которое будет содержать описание данного исключения.

// создание исключения: throw new ИмяКлассаИсключения(); - создан объект класса ИмяКлассаИсключения, наследник Throwable
// обработка исключения:
//        try{
//        операторы1;           --- операторы, вызывающие ошибку
//        } catch(Тип имя) {
//        операторы2;           --- операторы, которые вызываются при возн-нии исключения
//        } finally {
//        операторы3;
//        }

public class Task43 {

    public static void main(String[] args) {
        Object obj = null;

        if (obj == null) {
            try {
                obj.hashCode();
            } catch (NullPointerException i) {
                System.out.println("Нельзя пытаться получить доступ к полю ссылки null");
            } finally {
                obj = 0;
            }
        }
    }

}
