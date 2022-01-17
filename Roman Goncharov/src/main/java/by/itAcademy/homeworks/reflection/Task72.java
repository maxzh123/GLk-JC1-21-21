package by.itAcademy.homeworks.reflection;

/**
 * Задание 72
 * Создать собственную аннотацию @AcademyInfo c полем year. Создать метод, помеченный этой аннотацией с заданным year,
 * и метод без нее. С помощью рефлексии проверить наличие данной аннотации у этих методов из основной программы.
 */

import java.lang.reflect.Method;

public class Task72 {
    public static void main(String[] args) {
        TestAnnotation test = new TestAnnotation();
        annotationCheck(test);
    }

    public static void annotationCheck(Object obj) {
        Method[] methods = obj.getClass().getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(AcademyInfo.class)) {
                System.out.println("Метод " + method.getName() + " с аннотацией @AcademyInfo");
            } else System.out.println("Метод " + method.getName() + " без аннотации @AcademyInfo");
        }
    }
}