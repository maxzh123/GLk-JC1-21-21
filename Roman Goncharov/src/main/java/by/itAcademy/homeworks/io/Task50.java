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
        FileHandler.setNewPath("Package50"+File.separator+"Package1"+File.separator+"Package2"+File.separator);
        FileHandler fh1 = new FileHandler("File1.txt"), fh2 = new FileHandler("File2.txt"),
        fh3 = new FileHandler("File3.txt"), fh4 = new FileHandler("File4.txt"),
        fh5 = new FileHandler("File5.txt");
        String[] fileData = {fh1.readFile(),fh2.readFile(),fh3.readFile(),fh4.readFile(),fh5.readFile()};
        writeAllFilesToOneFile(fileData,"CommonFile.txt");
        writeFileNamesToFile(FileHandler.getDirectoryName(),"ListFile.txt");
    }

    public static void writeAllFilesToOneFile(String[] files, String fileNameToWrite) {
        FileHandler fileHandler = new FileHandler(fileNameToWrite);
        StringBuilder commonString = new StringBuilder();
        for(String file: files){
            commonString.append(file);
        }
        fileHandler.fileWrite(commonString.toString());
    }

    public static void writeFileNamesToFile(String nameDirectory, String fileNameToWrite) {
        File directory = new File(nameDirectory);
        FileHandler fileHandler = new FileHandler(fileNameToWrite);
        StringBuilder listString = new StringBuilder();
        for (File file : directory.listFiles()) {
            listString.append(file.getName()+"\n");
        }
        fileHandler.fileWrite(listString.toString());
    }
}