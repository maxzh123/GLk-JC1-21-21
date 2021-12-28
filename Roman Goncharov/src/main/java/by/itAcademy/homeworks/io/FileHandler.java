package by.itAcademy.homeworks.io;

import java.io.*;

public class FileHandler {
    private final String path = "." + File.separator + "Roman Goncharov" + File.separator + "src" + File.separator +
            "main" + File.separator + "java" + File.separator + "by" + File.separator + "itAcademy" + File.separator +
            "homeworks" + File.separator + "io" + File.separator;
    private String fileName;

    public FileHandler(String fileName) {
        this.fileName = fileName;
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
            System.out.println("Файл не найден: " + getFilePath());
        } catch (IOException e) {
            System.out.println("Ошибка. Что-то не так с файлом: " + getFilePath());
        }
        return fileData;
    }
}
