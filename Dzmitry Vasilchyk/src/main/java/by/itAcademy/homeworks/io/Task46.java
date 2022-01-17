package by.itAcademy.homeworks.io;

import java.io.File;

/**Вывести список файлов и каталогов выбранного каталога на диске.
 * Файлы и каталоги должны быть распечатаны отдельно.**/
public class Task46 {
    public  static void main(String[] args) {
        File dir = new File("D:\\фильмы");
        for (File item:dir.listFiles()){
            if (item.isDirectory()){
                System.out.println("\tкаталоги: " + item.getName());
            }
            else{
                System.out.println("\tфайлы: " + item.getName());
            }
        }
    }
}

