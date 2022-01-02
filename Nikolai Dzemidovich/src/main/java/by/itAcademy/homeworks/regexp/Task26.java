package by.itAcademy.homeworks.regexp;

import by.itAcademy.homeworks.types.MyReadHelper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task26 {
    public static void main(String[] args) {
        String text = MyReadHelper.readLine("Введите текст : ");
        System.out.println(findPunctuationSymbols(text));

    } public static int findPunctuationSymbols (String text){

        int count = 0;

        Pattern p1 = Pattern.compile("[\\p{Punct}]");
        Matcher m1 = p1.matcher(text);

        while(m1.find()){
            count++;
            System.out.println(m1.group() + " индекс " + m1.start());

        } return count;

    }
}
