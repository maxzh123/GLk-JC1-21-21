package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.regex.Matcher;

public class WorkWithFile {
    String fileSeparator = System.getProperty("file.separator");
    private String nameFile;
    private final String path = "Alina Artiomenko" + fileSeparator + "src" + fileSeparator +
            "main" + fileSeparator + "java" + fileSeparator + "by" + fileSeparator +
            "itAcademy" + fileSeparator + "homeworks" + fileSeparator + "io" + fileSeparator;

    WorkWithFile(String nameFile){
        this.nameFile = nameFile;
    }

    public String getPath() {
        return path + nameFile;
    }

    public void creatFileAndAddText(String file, String text){
        FileWriter writer = null;
        try {
            writer = new FileWriter(file,false);
            writer.write(text);
            writer.flush();
            System.out.println("Файл успешно создан и записан!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String readFile(String name){
        String s="";
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(name));
            while (true) {
                try {
                    if ((s=reader.readLine()) != null) break;
                    return s;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return s;
    }

    public void creatFileAndAddText(String file, int value){
        DataOutputStream outputStream = null;
        try {
            outputStream = new DataOutputStream(new FileOutputStream(file));
            for (int i = 0; i < value; i++){
                outputStream.writeByte((byte)(Math.random() * 10 + 11));
            }
            outputStream.flush();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}