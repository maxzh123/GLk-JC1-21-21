package by.itAcademy.homeworks.io;

import java.io.*;



/** Задание 46
 * 1) Вывести список файлов и каталогов выбранного каталога на диске.
 * 2) Файлы и каталоги распечатать отдельно.
 */

public class Task46 {

    public static void main(String[] args)  {
        File file = new File("D:\\English");
        try{
            getListOfFilesAndDirectors(file);
        } catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }


    }

    public static void getListOfFilesAndDirectors(File location) throws NullPointerException{
        System.out.println("Список каталогов\n" +"________________________________________");
        for (File dir: location.listFiles()){
            if(dir.isDirectory()){
                System.out.println(dir.getName());
            }
        }

        System.out.println("\nСписок файлов\n" +"_________________________________________");
       for (File file: location.listFiles()){
           if(file.isFile()){
               System.out.println(file.getName());
            }
        }
    }

}
