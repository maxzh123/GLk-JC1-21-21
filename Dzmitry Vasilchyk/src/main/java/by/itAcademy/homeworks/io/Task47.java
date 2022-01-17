package by.itAcademy.homeworks.io;

import by.itAcademy.homeworks.regexp.Task26;
import by.itAcademy.homeworks.regexp.Task27;

import java.io.*;

/**Создать файл с текстом, прочитать, подсчитать в тексте
 * количество знаков препинания и слов. Вывести результат на экран.**/

public class Task47 {
    public static String fileTest(File one){
        StringBuffer s=new StringBuffer();
        String res="";
        try {
           BufferedReader reader = new BufferedReader(new FileReader(one));
           String str=reader.readLine();
           while (str!=null){
               s.append(str+" "); //при склеивании съедает пробел в конце каждой строки
               str=reader.readLine();
           }
           res= "знаков препинания: "+Task26.string(s.toString())+";"+" слов: "+Task27.string(s.toString());
        }
        catch (IOException ioException){
            ioException.printStackTrace();
        }
       return res;
    }
}


