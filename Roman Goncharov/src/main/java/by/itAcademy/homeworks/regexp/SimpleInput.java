package by.itAcademy.homeworks.regexp;

import java.util.Scanner;

public class SimpleInput {
    static final private Scanner console = new Scanner(System.in);

    public static String getString(String text) {
        System.out.println(text);
        return console.nextLine();
    }
}
