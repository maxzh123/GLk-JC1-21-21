package by.itAcademy.homeworks.ControlWork.Work4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class PlayerReaderTask implements Runnable{
    String path = "Dzmitry Vasilchyk/src/main/java/by/itAcademy/homeworks/ControlWork/Work4/";
    File file = new File(path + "fileToWork4.txt");
    @Override
    public void run() {


        System.out.println(readFile.readNewFile(file));
        System.out.println("поток: "+Thread.currentThread().getName());

        }
    }

