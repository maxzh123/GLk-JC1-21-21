package by.itAcademy.homeworks.reflection;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


/** Задание 70
 * 1) Создать класс Man .
 * 2) Создать в классе набор полей и методов (не менее 3).
 * 3) Создать метод, который распечатает информацию о классе с помощью рефлексии.
 * 4) Вызвать метод с помощью рефлексии из основной программы.
 */

public class Task70 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Man man = new Man("Сергей", "Хомяков", 28);
        System.out.println("Проверяем, какие есть поля и методы в нашем классе:");
        System.out.println("_______________________________________________________________");
        getAllInfoAboutClass(man);
        System.out.println("_______________________________________________________________");
        System.out.println("Пробуем вызвать private метод printData, к которому у нас не должно быть доступа.");
        getPrivateMethodAllData(man);
        System.out.println("_______________________________________________________________");
        System.out.println("Пробуем вызвать private метод getInfo, к которому у нас не должно быть доступа.");
        System.out.println(getPrivateMethodInfo(man));
        System.out.println("_______________________________________________________________");
        System.out.println("Повторно вызываем private метод printData,чтобы убедиться, что предыдущий шаг поменял поле info.");
        getPrivateMethodAllData(man);

   }

    public static void getAllInfoAboutClass(Object object) {
        System.out.print("Fields in this class:");
        Field[] fields = object.getClass().getDeclaredFields();
        for (Field element : fields) {
            System.out.print(" " + element.getName() + ";");
        }
        System.out.println();
        System.out.print("Methods in this class:");
        Method[] methods = object.getClass().getDeclaredMethods();
        for (Method element: methods){
            System.out.print(" " + element.getName() + ";");
        }
        System.out.println();
    }

    public static String getPrivateMethodInfo(Object object) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = object.getClass().getDeclaredMethod("getInfo", null);
        method.setAccessible(true);
        return (String) method.invoke(object);
    }

    public static void getPrivateMethodAllData(Object object) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = object.getClass().getDeclaredMethod("printData", null);
        method.setAccessible(true);
        method.invoke(object);
    }
}
