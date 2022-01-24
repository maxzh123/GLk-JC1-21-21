package by.itAcademy.homeworks.collections;

import java.util.*;

public class Task40 {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
            l.add((int)Math.random()*50);
        }
        int i=0;
        for (Integer c:l) {
            if (c<3){
                l.remove(i);
            }
            i++;
        }
//        Iterator<Integer> i=l.iterator();
//        while(i.hasNext()) {
//            Integer current=i.next();
//          if(current<3) {i.remove();}
//          if(current<2) {i.remove();}
//        }

        System.out.println(Arrays.toString(l.toArray()));

    }
}
