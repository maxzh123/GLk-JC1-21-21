package by.itAcademy.homeworks.io;


import by.itAcademy.homeworks.collections.Task40;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Создать файл с текстом, в котором присутствуют числа.
 * Найти все числа, вывести на экран, посчитать сумму, убрать
 * все повторяющиеся числа и снова вывести на экран.**/

public class Task48 {
    public static String numberFromText(File file) {
        ArrayList<Integer> s = new ArrayList<>();
        String res="";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String str = reader.readLine();
            Pattern pattern = Pattern.compile("[0-9]+");
            while (str != null) {
                Matcher matcher = pattern.matcher(str);
                while (matcher.find()) {
                    s.add(Integer.parseInt(matcher.group()));
                }
                str = reader.readLine();
            }
            res = "первоначальный список: "+s+"/tсумма чисел: "+sumNumber(s)+
                    "/tсписок без повторов: " +Task40.delDuplikate(s);
        }  catch (IOException ioException) {
            ioException.printStackTrace();
        }
     return res;
    }
    public static Integer sumNumber(ArrayList<Integer>s){
        int sum=0;
        for(Integer x:s) {
            sum+=x;
        }
        return sum;
    }
}


