package by.itAcademy.homeworks.ControlWork.Work4;

import by.itAcademy.homeworks.ControlWork.Work4.createNewFile;

import java.io.File;

public class PlayerGeneratorTask implements Runnable{
    String path = "Dzmitry Vasilchyk/src/main/java/by/itAcademy/homeworks/ControlWork/Work4/";
    File file = new File(path + "fileToWork4.txt");

    @Override
    public void run() {

        createNewFile.writerNewFile(file,createNewFile.getListOfPlayer());
        System.out.println("поток: "+Thread.currentThread().getName()+" файл: "+file);

        }
}
