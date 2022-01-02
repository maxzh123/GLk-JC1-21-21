package by.itAcademy.homeworks.io;

import java.io.*;

public class WorkingWithAFile {
    private final String path = "Nikolai Dzemidovich" + File.separator + "src" + File.separator +
            "main" + File.separator + "java" + File.separator + "by" + File.separator + "itAcademy" + File.separator +
            "homeworks" + File.separator + "io" + File.separator;
    private String fileName;

    public WorkingWithAFile(String fileName){
        this.fileName = fileName;
    }
    public String getFilePath() {
        return path + fileName;
    }
    public String readFile () {
        StringBuilder str = new StringBuilder();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(getFilePath()))) {
            String temp = bufferedReader.readLine();
            while (temp != null) {
                str.append(temp);
                temp = bufferedReader.readLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("Файл не найден: " + fileName);
        } catch (IOException e) {
            e.fillInStackTrace();
        } return String.valueOf(str);
    }
}
