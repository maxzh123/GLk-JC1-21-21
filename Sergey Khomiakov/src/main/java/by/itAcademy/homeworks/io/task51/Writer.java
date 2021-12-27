package by.itAcademy.homeworks.io.task51;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Writer {

    public static void writerOfFiles(File file, List<Human> people){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            for (Human person : people) {
                writer.write(person + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
