package by.itAcademy.homeworks.collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

public class Task40 {
    static{
        System.out.println("Добрый вечер!");
    }

    static{
        System.out.println("Добрый вечер2!");
    }

    public static void main(String[] args) {
        List<Integer> l=new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
            l.add((int)Math.random()*50);
        }
        int i=0;
//        for (Integer c:l) {
//            if (c<3){
//                l.remove(i);
//            }
//            i++;
//        }
//        Iterator<Integer> i=l.iterator();
//        while(i.hasNext()) {
//            Integer current=i.next();
//          if(current<3) {i.remove();}
//          if(current<2) {i.remove();}
//        }

        System.out.println(Arrays.toString(l.toArray()));
       // myCall();
    }

    private static void myCall(){
        myCall();
    }
}
