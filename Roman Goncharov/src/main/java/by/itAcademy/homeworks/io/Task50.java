package by.itAcademy.homeworks.io;

/**
 * Задание 50
 * Создать цепочку из трех папок. В конечном каталоге создать 5 произвольных текстовых файлов.
 * Заполнить их 10 произвольными целыми числами. Содержимое файлов записать в один файл в том же каталоге.
 * Создать файл, который будет содержать список файлов данного каталога.
 */

import java.io.*;

public class Task50 {
    public static void main(String[] args) {
        FileHandler.setNewPathTask50();
        int fileCount = 5; // Кол-во читаемых файлов
        FileHandler fileHandlerOne = new FileHandler("CommonFile.txt");
        fileHandlerOne.fileWrite(getContentOfFiles(fileCount));
        FileHandler fileHandlerTwo = new FileHandler("ListFile.txt");
        fileHandlerTwo.fileWrite(getListOfFilesInDirectory(FileHandler.getDirectoryPath()));
    }

    public static String getListOfFilesInDirectory(String nameDirectory) {
        File directory = new File(nameDirectory);
        StringBuilder listString = new StringBuilder();
        try {
            for (File file : directory.listFiles()) {
                listString.append(file.getName() + "\n");
            }
        } catch (NullPointerException e) {
            System.out.println("Каталог не содержит файлов. Проверьте путь : " + nameDirectory);
        }
        return listString.toString();
    }

    public static String getContentOfFiles(int number) {
        FileHandler[] fileHandlers = new FileHandler[number];
        StringBuilder listString = new StringBuilder();
        for (int i = 0; i < number; i++) {
            fileHandlers[i] = new FileHandler("File" + (i + 1) + ".txt");
            listString.append(fileHandlers[i].readFile());
        }
        return listString.toString();
    }
}