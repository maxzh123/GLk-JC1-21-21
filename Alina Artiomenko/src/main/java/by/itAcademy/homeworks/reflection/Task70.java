package by.itAcademy.homeworks.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**Задание 70
 * 1. Создать класс Main с произвольным набором полей и методов (не менее 3)
 * 2. Создать метод, который распечатет информацию о классе с помощью рефлексии
 * 3. Вызвать метод с помощью рефлексии из основной программы
 */
//ПОКА ЕЩЁ НЕ РЕАЛИЗОВАЛА ВЫЗОВ МЕТОДА РЕФЛЕКСИЕЙ
public class Task70 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Main firstMain = new Main("Дед", "Мазай", 86, 25);
        //firstMain.putInTheBoat();
        //firstMain.checkNumberOfPessengersInTheBoat();
        System.out.println("Интерфейсы класса Main:\n-------------------");
        printInterfacesOfClass();
        System.out.println("\nМетоды класса Main:\n-------------------");
        printDeclaredMethods();
        System.out.println("\nПоля класса Main:\n-------------------");
        printDeclaredFields();
    }

    public static void printInterfacesOfClass() {
        Class mClassObject = Main.class;
        Class[] interfaces = mClassObject.getInterfaces();
        for (Class in : interfaces) {
            System.out.println(in);
        }
    }

    public static void printDeclaredMethods(){
        Class mClassObject = Main.class;
        Method[] methods = mClassObject.getDeclaredMethods();
        for (Method meth : methods) {
            System.out.println(meth);
        }
    }

    public static void printDeclaredFields(){
        Class mClassObject = Main.class;
        Field[] fields = mClassObject.getDeclaredFields();
        for (Field fil : fields) {
            System.out.println(fil);
        }
    }
}
