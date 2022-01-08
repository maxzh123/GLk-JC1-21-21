package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFileAssistant {
    private final String path = "Sergey Khomiakov" + File.separator + "src" + File.separator + "main" +
                File.separator + "java" + File.separator + "by" + File.separator + "itAcademy" + File.separator +
                "homeworks" + File.separator + "io" + File.separator;
    private String nameOfFile;

    public String getNameOfFile(){
        return nameOfFile;
    }

    public String getFullPath(){
        return path + nameOfFile;
    }

    public ReadWriteFileAssistant(String nameOfFile){
        this.nameOfFile = nameOfFile;
    }

    // метод чтения строковых данных из файла
    public String readTextFromFile(){
        StringBuilder text = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(getFullPath()))){
                String tmp = reader.readLine();
                while (tmp!=null){
                    text.append(tmp);
                    tmp = reader.readLine();
                }
             } catch (IOException ex){
                System.out.println(ex.getMessage());
            }

        return text.toString();
    }

    // метод записи строковых данных в файл
    public void writeTextInFile(String text){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(getFullPath()))){
            writer.write(text);
            System.out.println("Файл записан!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // метод записи случайных чисел в бинарный файл
    public void writeDataInBinaryFile(int countOfNumbers){
        try (DataOutputStream  dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(getFullPath())))){
            for(int i = 0; i < countOfNumbers;i++){
                dataOutputStream.writeInt((int)(Math.random()*100));
            } System.out.println("Файл записан!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    // метод чтения чисел из бинарного файла и передача их в коллекцию List
    public List<Integer> readDataFromBinaryFile()  {
        List<Integer> arrayList = new ArrayList<>();
        try(DataInputStream reader = new DataInputStream(new BufferedInputStream(new FileInputStream(getFullPath())))){
            int number = reader.readInt();
            while (true){
                arrayList.add(number);
                try{
                    number = reader.readInt();}
                catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return arrayList;
    }



    public void writeObjectInFile(List<Object> objectList){
        try(ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(getFullPath()))){
            writer.writeObject(objectList);
        } catch (IOException e) {
            System.out.println(e.getMessage());
    }

}
}


