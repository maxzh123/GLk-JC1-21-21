package by.itAcademy.homeworks.ControlWork.Work4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class createNewFile {
    public static void main(String[] args) {
    }
    public static List<Player> getListOfPlayer() {
        ArrayList<Player> massiv = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            massiv.add(new Player());
        }
        return massiv;
    }
    public static void writerNewFile(File file, List<Player> player) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Player play : player) {
                writer.write(play + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
