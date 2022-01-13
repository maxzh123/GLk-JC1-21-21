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

public class Task70 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Main firstMain = new Main("Дед", "Мазай", 86, 25);
        firstMain.putInTheBoat();
        firstMain.checkNumberOfPessengersInTheBoat();

        System.out.println("\nИнтерфейсы класса Main:\n-------------------");
        printInterfacesOfClass(firstMain);
        System.out.println("\nМетоды класса Main:\n-------------------");
        printDeclaredMethods(firstMain);
        System.out.println("\nПоля класса Main:\n-------------------");
        printDeclaredFields(firstMain);
        System.out.println("\nВызов метода checkNumberOfPessengersInTheBoat:\n-------------------");
        callinCheckNumberOfPessengersInTheBoat(firstMain);
    }

    public static void printInterfacesOfClass(Object obj) {
        Class [] mClassObject = obj.getClass().getInterfaces();
                for (Class in : mClassObject) {
            System.out.println(in.getName());
        }
    }

    public static Method[] printDeclaredMethods(Object obj){
        Method[] mClassObject = obj.getClass().getDeclaredMethods();
        for (Method meth : mClassObject) {
            System.out.println(meth.getName());
        }
        return mClassObject;
    }

    public static void printDeclaredFields(Object obj){
        Field[] mClassObject = obj.getClass().getDeclaredFields();
        for (Field fil : mClassObject) {
            System.out.println(fil.getName());
        }
    }

    public static void callinCheckNumberOfPessengersInTheBoat(Object obj){
        Method[] methods = obj.getClass().getDeclaredMethods();
        for (Method m : methods){
            if (m.getName().equals("checkNumberOfPessengersInTheBoat")){
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
