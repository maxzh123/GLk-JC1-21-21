package by.itAcademy.homeworks.io;

public class Task48 {
    public static void main(String[] args) {
        WorkingWithAFile file = new WorkingWithAFile("TextForTask48");
        String text = file.readFile();
        file.displayListOfNumber(text);
        System.out.println("Сумма = " + file.sumOfNumberInFile());
        System.out.println(file.displayListWithoutRepetitions());

    }
}
