package by.itAcademy.homeworks.io;

/**
 * Задание 50
 * Создать цепочку из трех папок. В конечном каталоге создать 5 произвольных текстовых файлов.
 * Заполнить их 10 произвольными целыми числами. Содержимое файлов записать в один файл в том же каталоге.
 * Создать файл, который будет содержать список файлов данного каталога.
 */

import java.io.*;

public class Task50 {
    private static final String path = "io" + File.separator + "Package50" +
            File.separator + "Package1" + File.separator + "Package2" + File.separator;

    public static void main(String[] args) {
        int fileCount = 5; // Кол-во читаемых файлов
        FileHandler fileHandlerOne = new FileHandler(path + "CommonFile.txt");
        fileHandlerOne.fileWrite(getContentOfFiles(fileCount));
        FileHandler fileHandlerTwo = new FileHandler(path + "ListFile.txt");
        fileHandlerTwo.fileWrite(getListOfFilesInDirectory(fileHandlerTwo.getDirectoryPath() + path));
    }

    public static String getListOfFilesInDirectory(String nameDirectory) {
        File directory = new File(nameDirectory);
        StringBuilder listString = new StringBuilder();
        try {
            for (File file : directory.listFiles()) {
                listString.append(file.getName()).append("\n");
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
            fileHandlers[i] = new FileHandler(path + "File" + (i + 1) + ".txt");
            listString.append(fileHandlers[i].readFile());
        }
        return listString.toString();
    }
}