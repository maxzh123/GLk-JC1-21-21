package by.itAcademy.homeworks.reflection;

/** Задание 71
 * 1) Создать класс с методом printHelloWorld().
 * 2) Вызвать метод с помощью рефлексии из основной программы.
 */

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Task71 {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        Hello myClassHello = new Hello();
        getPrivateMethod(myClassHello);
    }

    public static void getPrivateMethod(Object object) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = object.getClass().getDeclaredMethod("printHelloWorld", null);
        method.setAccessible(true);
        method.invoke(object);
    }
}
