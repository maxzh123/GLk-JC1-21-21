package by.itAcademy.homeworks.io;

import java.io.File;

/**
 * > Вывести список файлов и каталогов выбранного каталога на диске. Файлы и
 * > каталоги должны быть распечатаны отдельно.
 */

public class Task46 {
    public static void main(String[] args) {

        File file = new File("C:\\Java");
        printListOfDirectory(file);
        System.out.println("");
        printListOfFile(file);
    }

    public static void printListOfDirectory(File directory) {
        for (File dir : directory.listFiles()) {
            if (dir.isDirectory()) {
                System.out.println(dir.getName());
            }
        }
    }

    public static void printListOfFile(File file) {
        for (File files : file.listFiles()) {
            if (files.isFile()) {
                System.out.println(files.getName());
            }
        }
    }
}
