package by.itAcademy.homeworks.io;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**Задание 50
 * 1. Создать цепочку из трех папок.
 * 2. В конечном каталоге создать 5 произвольных текстовых файлов.
 * 3. Заполнить их 10 произвольными целыми числами.
 * 4. Содержимое файлов записать в один файл в том же каталоге.
 * 5. Создать файл, который будет содержать список файлов данного каталога.
 */

public class Task50 {
    public static void main(String[] args) throws IOException {
        final int valueOfFile = 5;
        final int valueOfNumber = 10;

        WorkWithFileNew task50Direct = new WorkWithFileNew("Task50-Level-01\\" +
                "Task50-Level-02\\Task50-Level-03");

        task50Direct.createNewDirect();
        createSomeFile("Task50",task50Direct.getPath(),valueOfFile);

        List<WorkWithFileNew> listOfNameFiles = createSomeFile("Task50",task50Direct.getPath(),valueOfFile);


        for (WorkWithFileNew txtFile : listOfNameFiles){
            txtFile.writeToFile(Task49.getRandomNumbers(valueOfNumber));
        }

        WorkWithFileNew newFileWithInform = new WorkWithFileNew("InformFromAllFiles.txt");
        newFileWithInform.createNewFileInDirect(task50Direct.getPath());
        List<String> textFromFile = new ArrayList<>();

        for(WorkWithFileNew txtFile : listOfNameFiles){
            System.out.println("Файл " + txtFile.getNameFile() + " прочитан!");
            txtFile.printTextFromFile(txtFile.readFileFromDirect());
            textFromFile.add(String.valueOf(txtFile.readFileFromDirect()));
            System.out.println("----------------------------");
        }
        newFileWithInform.writeToFile(textFromFile);
        newFileWithInform.printTextFromFile(textFromFile);

        WorkWithFileNew newFileIndirect = new WorkWithFileNew("FilesInDirect.txt");
        newFileIndirect.createNewFileInDirect(task50Direct.getPath());
        List<String> listOfName = newFileIndirect.getNameOfFilesInDirect(task50Direct.getPath());
        newFileIndirect.writeToFile(listOfName);
        System.out.println("\nСодержимое папки:");
        newFileIndirect.printTextFromFile(newFileIndirect.readFileFromDirect());
    }

    public static List<WorkWithFileNew> createSomeFile (String nameOfFile, String pathOfDirect, int amountOfFile){
        List<WorkWithFileNew> listOfNames = new ArrayList<>();
        for (int i = 0; i < amountOfFile; i++){
            WorkWithFileNew task50File = new WorkWithFileNew(nameOfFile + "-" +  i + ".txt");
            task50File.createNewFileInDirect(pathOfDirect);
            listOfNames.add(task50File);
        }
        return listOfNames;
    }
}
