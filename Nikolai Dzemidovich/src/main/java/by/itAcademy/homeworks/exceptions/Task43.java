package by.itAcademy.homeworks.exceptions;

public class Task43 {
    public static void main(String[] args) {

        String x1 = null, x2 = "Nick";

        try {

            System.out.println(x1.equals(x2));

        } catch (NullPointerException e) {

            System.out.println("Одно из значений пустое");

        }
    }
}
