package by.itAcademy.homeworks.reflection;

/** Задание 72
 * 1) Создать собственную аннотацию @AcademyInfo c полем year.
 * 2) Создать метод,помеченный этой аннотацией с заданным year, и метод без нее.
 * 3) С помощью рефлексии проверить наличие данной аннотации у этих методов из основной программы.
 */

public class ExampleForTask72 {

    @AcademyInfo(year = "1.0")
    private void methodWithAnnotation(){
        System.out.println("This method has an annotation");
    }

    private void methodWithoutAnnotation(){
        System.out.println("This method hasn`t an annotation");
    }
}
