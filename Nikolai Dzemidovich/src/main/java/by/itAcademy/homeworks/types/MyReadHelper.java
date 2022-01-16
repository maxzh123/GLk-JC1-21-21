package by.itAcademy.homeworks.types;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MyReadHelper {

    static final private Scanner scr = new Scanner(System.in);

    static public Integer readInt(String title) {
        System.out.println(title);
        return scr.nextInt();
    }

    static public String readLine(String title) {
        System.out.println(title);
        scr.useDelimiter("[\r\n]");
        String value = scr.next(".*\\S+.*$");
        scr.useDelimiter(Pattern.compile("\\p{javaWhitespace}+"));
        return value;
    }
    static public double readDouble(String title){
        System.out.println(title);
        return scr.nextDouble();
    }
}