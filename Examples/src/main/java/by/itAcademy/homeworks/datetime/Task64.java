package by.itAcademy.homeworks.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task64 {
    public static void main(String[] args) throws ParseException {
        String pattern = "yy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date now=new Date();
        System.out.println(now);
        System.out.println(simpleDateFormat.format(now));
        System.out.println(simpleDateFormat.parse("21-06-09"));
    }
}
