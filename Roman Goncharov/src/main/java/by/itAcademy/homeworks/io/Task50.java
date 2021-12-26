package by.itAcademy.homeworks.io;

/**
 * Задание 50
 * Создать цепочку из трех папок. В конечном каталоге создать 5 произвольных текстовых файлов.
 * Заполнить их 10 произвольными целыми числами. Содержимое файлов записать в один файл в том же каталоге.
 * Создать файл, который будет содержать список файлов данного каталога.
 */

import java.io.*;

public class Task50 {
    public static void main(String[] args) {
        String path1 = ".//Roman Goncharov//src//main//java//by//itAcademy//homeworks//io//Package50//Package1//Package2//File1.txt";
        String path2 = ".//Roman Goncharov//src//main//java//by//itAcademy//homeworks//io//Package50//Package1//Package2//File2.txt";
        String path3 = ".//Roman Goncharov//src//main//java//by//itAcademy//homeworks//io//Package50//Package1//Package2//File3.txt";
        String path4 = ".//Roman Goncharov//src//main//java//by//itAcademy//homeworks//io//Package50//Package1//Package2//File4.txt";
        String path5 = ".//Roman Goncharov//src//main//java//by//itAcademy//homeworks//io//Package50//Package1//Package2//File5.txt";
        File[] arrayFiles = {new File(path1), new File(path2), new File(path3), new File(path4), new File(path5)};
        writeAllFilesToOneFile(arrayFiles);
        writeFileNamesToFile(new File(".//Roman Goncharov//src//main//java//by//itAcademy//homeworks//io//Package50//Package1//Package2"));
    }

    public static void writeAllFilesToOneFile(File[] files) {
        File fileForWrite = new File(".//Roman Goncharov//src//main//java//by//itAcademy//homeworks//io//Package50//Package1//Package2//CommonFile.txt");
        String content = "";
        for (File file : files) {
            try (BufferedReader br = new BufferedReader(new FileReader(file)); BufferedWriter bw = new BufferedWriter(new FileWriter(fileForWrite))) {
                String str = br.readLine();
                while (str != null) {
                    content += str + "\n";
                    str = br.readLine();
                }
                bw.write(content);
            } catch (FileNotFoundException e) {
                System.out.println("Файл не найден: " + file.getName());
            } catch (IOException e) {
                System.out.println("Ошибка. Что-то не так с файлом: " + file.getName());
            }
        }
    }

    public static void writeFileNamesToFile(File directory) {
        File fileForWrite = new File(".//Roman Goncharov//src//main//java//by//itAcademy//homeworks//io//Package50//Package1//Package2//ListFile.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileForWrite))) {
            for (File file : directory.listFiles()) {
                bw.write(file.getName());
                bw.newLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileForWrite.getName());
        } catch (IOException e) {
            System.out.println("Ошибка. Что-то не так с файлом: " + fileForWrite.getName());
        }
    }
}