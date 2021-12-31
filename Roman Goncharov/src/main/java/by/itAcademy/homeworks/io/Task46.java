package by.itAcademy.homeworks.io;

/**
 * Задание 46
 * Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.
 */

import java.io.File;

public class Task46 {
    public static void main(String[] args) {
        File path = new File(".");
        outputListOfDirectory(path);
        outputListOfFiles(path);
    }

    public static void outputListOfDirectory(File directory) {
        System.out.println("Каталоги:");
        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                System.out.println(file.getName());
            }
        }
    }

    public static void outputListOfFiles(File directory) {
        System.out.println("Файлы:");
        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}