package by.itAcademy.homeworks.oop.Task34Factory;

public class Task34 {
    public static void main(String[] args) {
        Foreman foreman = new Foreman("Дмитрий", 35);
        LoaderDriver loaderDriver = new LoaderDriver("Николай", 27);
        WireMaker wireMaker = new WireMaker("Алексей", 23);
        foreman.employeeDescription();
        loaderDriver.employeeDescription();
        wireMaker.employeeDescription();
    }
}