package by.itAcademy.homeworks.io.task51;

import java.io.*;
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

    public static void writerOfObject(File file, List<Human> people){
        try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(file))){
            writer.writeObject(people);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
