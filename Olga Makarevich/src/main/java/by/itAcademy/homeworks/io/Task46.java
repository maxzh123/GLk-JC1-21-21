package by.itAcademy.homeworks.io;

// Вывести список файлов и каталогов выбранного каталога на диске.
// Файлы и каталоги должны быть распечатаны отдельно.

import java.io.File;
import java.util.Arrays;

public class Task46 {
    public static void main(String[] args) {
        File file = new File("D:\\");
        if (file.isFile()) {
            System.out.println("Файлы" + Arrays.toString(file.list()));  // не показывает файлы
        }
        if (file.isDirectory()) {
            System.out.println("Каталоги" + Arrays.toString(file.list()));
        }
    }
}