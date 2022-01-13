package by.itAcademy.homeworks.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** Задание 72
 * 1) Создать собственную аннотацию @AcademyInfo c полем year.
 * 2) Создать метод,помеченный этой аннотацией с заданным year, и метод без нее.
 * 3) С помощью рефлексии проверить наличие данной аннотации у этих методов из основной программы.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface AcademyInfo {
    String year();
}
