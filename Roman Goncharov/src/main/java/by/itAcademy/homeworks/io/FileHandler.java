package by.itAcademy.homeworks.io;

import java.io.*;

public class FileHandler {
    private static String path = "." + File.separator + "Roman Goncharov" + File.separator + "src" + File.separator +
            "main" + File.separator + "java" + File.separator + "by" + File.separator + "itAcademy" + File.separator +
            "homeworks" + File.separator + "io" + File.separator;
    private String fileName;

    public FileHandler(String fileName) {
        this.fileName = fileName;
    }

    public static void setNewPath(String directory){
        boolean bool = new File(path + directory).isDirectory();
        if (bool){
            path += directory;
        }
    }

    public String getFileName(){
        return fileName;
    }

    public static String getDirectoryName(){
        return path;
    }

    public String getFilePath() {
        return path + fileName;
    }

    public String readFile() {
        String fileData = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(getFilePath()))) {
            String str = bufferedReader.readLine();
            while (str != null) {
                fileData += str + "\n";
                str = bufferedReader.readLine();
            }
            System.out.print("Файл успешно прочитан. Содержимое файла:\n" + fileData + "\n");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка. Что-то не так с файлом: " + fileName);
        }
        return fileData;
    }

    public void fileWrite(String str) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(getFilePath()))) {
            bw.write(str);
            System.out.println("Запись в файл "+fileName+" произведена успешно.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка. Что-то не так с файлом: " + fileName);
        }
    }
}
