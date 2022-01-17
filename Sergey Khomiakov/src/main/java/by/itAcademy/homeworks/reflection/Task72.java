package by.itAcademy.homeworks.reflection;


import java.lang.reflect.Method;


/** Задание 72
 * 1) Создать собственную аннотацию @AcademyInfo c полем year.
 * 2) Создать метод,помеченный этой аннотацией с заданным year, и метод без нее.
 * 3) С помощью рефлексии проверить наличие данной аннотации у этих методов из основной программы.
 */

public class Task72 {
    public static void main(String[] args) throws NoSuchMethodException {
      Year year = new Year();
        getAllMethodsWithAnnotationAcademyInfo(year);
    }

    public static void getAllMethodsWithAnnotationAcademyInfo(Object object){
        Method[] methods = object.getClass().getDeclaredMethods();
         for (Method element:methods){
             if(element.getDeclaredAnnotation(AcademyInfo.class)!=null){
                 System.out.println(element.getName());
                 System.out.println(element.getDeclaredAnnotation(AcademyInfo.class).toString());
             }

         }
    }

}




