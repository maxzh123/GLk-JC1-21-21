package by.itAcademy.homeworks.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WorkWithFileNew {
    String fileSeparator = System.getProperty("file.separator");
    private String nameFile;
    private String directory;
    private final String path = "Alina Artiomenko" + fileSeparator + "src" + fileSeparator +
            "main" + fileSeparator + "java" + fileSeparator + "by" + fileSeparator +
            "itAcademy" + fileSeparator + "homeworks" + fileSeparator + "io" + fileSeparator;

    private final String pathThreads = "Alina Artiomenko" + fileSeparator + "src" + fileSeparator +
            "main" + fileSeparator + "java" + fileSeparator + "by" + fileSeparator +
            "itAcademy" + fileSeparator + "homeworks" + fileSeparator + "threads" + fileSeparator;

    public WorkWithFileNew(String nameFile){
        this.nameFile = nameFile;
    }

    public String getPath(){
        return path + nameFile;
    }

    public String getPathThreads(){
        return pathThreads + nameFile;
    }

    public String getNameFile(){
        return nameFile;
    }

    public List<String> getNameOfFilesInDirect(String path){
        List<String> list = new ArrayList<>();
        File listOfName = new File(path);
        for(File file : listOfName.listFiles()){
            if (file.isFile()){
                list.add(file.getName() + "\n");
            }
        }
        return list;
    }

    public void createNewFile(){
        try {
            if(new File(getPath()).createNewFile()){
                System.out.println("Файл " + nameFile + " создан!");
            } else {
                System.out.println("Файл " + nameFile + " уже был создан!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createNewFileThreads(){
        try {
            if(new File(getPathThreads()).createNewFile()){
                System.out.println("Файл " + nameFile + " создан!");
            } else {
                System.out.println("Файл " + nameFile + " уже был создан!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createNewFileInDirect(String directory){
        this.directory = directory;
        try {
            if(new File(directory + fileSeparator + nameFile).createNewFile()){
                System.out.println("Файл " + nameFile + " создан!");
            } else {
                System.out.println("Файл " + nameFile + " уже был создан!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createNewDirect(){
        File direct = new File(getPath());
        direct.mkdirs();
        System.out.println("Папки успешно созданы!");
    }

    public List<String> readFile(){
        List<String> linesFromFile = Collections.emptyList();
        try {
            linesFromFile = Files.readAllLines(Paths.get(getPath()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return linesFromFile;
    }

    public List<String> readFileFromDirect(){
        List<String> linesFromFile = Collections.emptyList();
        try {
            linesFromFile = Files.readAllLines(Paths.get(directory + fileSeparator + nameFile));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return linesFromFile;
    }

    public List<Integer> readBinaryFile(){
        List<Integer> listOfNumber = new ArrayList<>();
        DataInputStream reader = null;
        try {
            reader = new DataInputStream(new FileInputStream(getPath()));
            int number = reader.readInt();
            while (true) {
                listOfNumber.add(number);
                try {
                    number = reader.readInt();
                } catch (EOFException e) {
                    break;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(reader !=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return listOfNumber;
    }

    public void writeToFile(String text){
        FileWriter writeToFile = null;
        try {
            writeToFile = new FileWriter(getPath());
            writeToFile.write(text);
            writeToFile.flush();
            System.out.println("В файл записан текст!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                writeToFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeToFile(List<String> text){
        FileWriter writeToFile = null;
        try {
            writeToFile = new FileWriter(directory + fileSeparator + nameFile);
            for(String list : text){
                writeToFile.write(list);
                //writeToFile.flush();
            }
            System.out.println("В файл " + nameFile + " записан текст!");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                writeToFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeObjectToFile(List obj){
        ObjectOutputStream writer = null;
        try {
            writer = new ObjectOutputStream(new FileOutputStream(getPath()));
            for(Object list : obj){
                writer.writeObject(list.toString());
            }
            System.out.println("В файл " + nameFile + " записан текст!");
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

    public void writeToFile(int[] arrayOfNumber){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(directory + fileSeparator + nameFile);
            fileWriter.write(Arrays.toString(arrayOfNumber));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeToFileThreads(int[] arrayOfNumber){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(getPathThreads());
            fileWriter.write(Arrays.toString(arrayOfNumber));
            System.out.println("Файл " + nameFile + " успешно записан!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void writeToBinaryFile(int[] arrayOfNumber){
        DataOutputStream writeToBinaryFile = null;
        try {
            writeToBinaryFile = new DataOutputStream(new FileOutputStream(getPath()));
            for(int array : arrayOfNumber){
                writeToBinaryFile.writeInt(array);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                writeToBinaryFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public int printTextFromFile(List listOfText){
        List text = listOfText;
        for(Object list : text){
            System.out.println(list);
        }
        return 0;
    }
}