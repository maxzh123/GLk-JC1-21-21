package by.itAcademy.homeworks.exceptions;

public class MyException extends Throwable {
//    public String toString() {
//        return "Цветок не расцветет";
//    }
    public MyException (String message) {
        super(message);
    }
}
