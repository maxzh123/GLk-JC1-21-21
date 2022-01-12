package by.itAcademy.homeworks.reflection;

public class Printer {
    private String printText;

    Printer(String printText){
        this.printText = printText;
    }

    public void printHelloWorld(){
        System.out.println(printText);
    }
}
