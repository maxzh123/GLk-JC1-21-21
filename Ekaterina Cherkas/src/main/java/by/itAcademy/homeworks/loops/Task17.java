package by.itAcademy.homeworks.loops;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Task17 {
    public static void main(String[] args) throws Exception{
        DecimalFormat formatter = new DecimalFormat();
        DecimalFormatSymbols symbols=DecimalFormatSymbols.getInstance();
        symbols.setGroupingSeparator(' ');
        formatter.setDecimalFormatSymbols(symbols);
        int i = 20023143;
        String s = formatter.format(i).toString();
        System.out.println(s);
    }
}
