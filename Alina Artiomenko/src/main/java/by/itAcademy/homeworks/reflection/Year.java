package by.itAcademy.homeworks.reflection;

public class Year {

    @AcademyInfo(year = 1994)
    public void MethotWihtAnnotation(){
        System.out.println("Метод С аннотацией!");
    }

    public void MethotWihoutAnnotation(){
        System.out.println("Метод БЕЗ аннотации!");
    }
}
