package by.itAcademy.homeworks.reflection;
import java.lang.reflect.Method;

/**Задание 72
 * 1. Создать аннотацию @AcademyInfo с полем year
 * 2. Создать мотод, помеченный этой аннотацией с заданным year
 * 3. Создать метод не помеченный этой аннотацией
 * 4. Проверить наличие данной анотации у методов из основной программы через рефлексию
 */

public class Task72 {
    public static void main(String[] args) {
        Method[] methods = Year.class.getDeclaredMethods();
        for (Method method : methods){
            if(method.isAnnotationPresent(AcademyInfo.class)){
                System.out.println(method.getName() + "- аннотация ЕСТЬ");
            } else{
                System.out.println(method.getName() + "- аннотации НЕТ");
            }
        }
    }
}
