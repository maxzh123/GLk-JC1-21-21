package by.itAcademy.homeworks.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class Task70 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //AnimalPerson cat = new AnimalPerson("Мурзик",4);
        HashMap cat = new HashMap(10);
        hackersMethod(cat);
        hackersMethod2(cat);
        hackersMethod3(cat);
        System.out.println(cat);
    }

    private static void hackersMethod(Object a) throws InvocationTargetException, IllegalAccessException {
        Method[] methods= a.getClass().getDeclaredMethods();
        for (Method m: methods){
            System.out.println(m.getName());
            Annotation[] ans=m.getAnnotations();
            for (Annotation an: ans){
                System.out.println(an instanceof Deprecated);
            }
//            if(m.getName().equals("setName")){
//                m.setAccessible(true);
//                m.invoke(a,"Тузик");
//            }
//            if(m.getName().equals("setAge")){
//                m.setAccessible(true);
//                m.invoke(a,88);
//            }
        }
    }

    private static void hackersMethod2(Object a) throws InvocationTargetException, IllegalAccessException {
        Field[] flds= a.getClass().getDeclaredFields();
        for (Field f: flds){
            f.setAccessible(true);
            System.out.println(f.getName()+" -> "+f.get(a));
            if(f.getName().equals("age")){
                f.set(a,55);
            }
        }
    }
    private static void hackersMethod3(Object a) throws InvocationTargetException, IllegalAccessException {
        Class c;
        do{
            c= a.getClass().getSuperclass();
            System.out.println(c.getCanonicalName());
        }while(! (c!=null && c instanceof  Object));
    }


}
