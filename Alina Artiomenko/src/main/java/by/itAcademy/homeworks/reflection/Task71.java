package by.itAcademy.homeworks.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;

/**Задание 71
 * 1. Создать класс с методом printHelloWorld()
 * 2. Вызвать метод с помощью рефлексии из основной программы
 */
public class Task71 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Constructor constructor = Printer.class.getDeclaredConstructor(String.class);
        Printer printer = (Printer) constructor.newInstance("Этот текст я хочу вывести!");
        callMethod(printer);
    }

    public static void callMethod(Object obj){
        Method[] methods = obj.getClass().getDeclaredMethods();
        for(Method m : methods){
            if(m.getName().equals("printHelloWorld")){
                m.setAccessible(true);
                try {
                    m.invoke(obj);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
