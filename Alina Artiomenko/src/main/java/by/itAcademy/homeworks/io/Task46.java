package by.itAcademy.homeworks.io;

import java.io.*;

/**Задание 46
 * 1. Вывести список файлов и каталогов выбранного каталога на диске.
 * 2. Файлы и каталоги распечатать отдельно.
 */

public class Task46 {
    public static void main(String[] args) {
        final String path = "d:/";
        File listOfName = new File(path);
        System.out.println("Вывод списка файлов: ");
        printNameOfFile(listOfName);
        System.out.println("----------------------------");
        System.out.println("Вывод списка директорий: ");
        printNameOfDirectory(listOfName);
    }

    public static void printNameOfDirectory(File list){
        for (File directory : list.listFiles()){
            if (directory.isDirectory()){
                System.out.println(directory.getAbsolutePath());
            }
        }

    }

    public static void printNameOfFile(File list){
        for (File file : list.listFiles()){
            if (file.isFile()){
                System.out.println(file);
            }
        }
    }
}
