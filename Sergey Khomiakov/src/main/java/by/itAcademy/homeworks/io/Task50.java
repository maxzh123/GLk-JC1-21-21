package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/** Задание 50
 * 1) Создать цепочку из трех папок.
 * 2) В конечном каталоге создать 5 произвольных текстовых файлов. Заполнить их 10 произвольными целыми числами.
 * 3) Содержимое файлов записать в один файл в том же каталоге.
 * 4) Создать файл, который будет содержать список файлов данного каталога.
  */

public class Task50 {
    public static List<String> listWithPathToFiles = new ArrayList<>();
    public static final String path = "Sergey Khomiakov/src/main/java/by/itAcademy/homeworks/io/task50/folder1/folder2/";

    public static void main(String[] args) {
        fillTheArrayWithPathOfFile();                                       //создаем 5 файлов с числами
        writeAllDataInOneFile("FileWithAllDataFromFolder.txt");   //создаем файл, в котором находятся все числа из файлов, созданных предыдущим методом
        getFileListFiles("ListOfFiles.txt");                      // создаем файл, в котором находится наименование файлов из указанной папки
    }

    //данный метод создает файл, в который заносится 10 чисел
    public static void writeRandomNumberInFile(String nameFile) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nameFile))) {
            for (int i = 0; i < 10; i++) {
                writer.write((int) (Math.random() * 100 + 1) + " ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //данный метод создает файл, в который заносится информация с других файлов из заданной папки
    public static void writeAllDataInOneFile(String nameOfFile) {
        String text = "";
        for (String element : listWithPathToFiles) {
            try (BufferedReader reader = new BufferedReader(new FileReader(element));
                 BufferedWriter writer = new BufferedWriter(new FileWriter(path + nameOfFile))) {

                String number = reader.readLine();
                while (number != null) {
                    text += number + "\n";
                    number = reader.readLine();
                }
                writer.write(text);

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //вспомогательный метод для создания 5 файлов с числами
    public static void fillTheArrayWithPathOfFile() {
        for (int i = 0; i < 5; i++) {
            String name = String.format("FileWithNumbers[%d].txt", i);
            writeRandomNumberInFile(path + name);
            listWithPathToFiles.add(path + name);
        }
    }

    //данный метод создает файл, в который заносится наименование всех файлов в выбраной папке
    public static void getFileListFiles(String nameOfFile) {
        File file = new File(path);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path + nameOfFile))) {
            for (File arr : file.listFiles()) {
                 writer.write(arr.getName() + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}