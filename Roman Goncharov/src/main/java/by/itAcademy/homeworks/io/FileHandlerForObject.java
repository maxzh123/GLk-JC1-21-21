package by.itAcademy.homeworks.io;

import by.itAcademy.homeworks.io.Task51Objects.Person;

import java.io.*;
import java.util.Arrays;

public class FileHandlerForObject<T extends Person> {
    private T[] people;
    private String path = "." + File.separator + "Roman Goncharov" + File.separator + "src" + File.separator +
            "main" + File.separator + "java" + File.separator + "by" + File.separator + "itAcademy" + File.separator +
            "homeworks" + File.separator + "io" + File.separator;
    private String fileName;

    public FileHandlerForObject(String fileName, T[] people) {
        this.fileName = fileName;
        this.people = people;
    }

    public String getDirectoryPath() {
        return path;
    }

    public String getFilePath() {
        return path + fileName;
    }

    public String textDescriptionOfPeople() {
        StringBuilder listString = new StringBuilder();
        for (Person person : people) {
            listString.append(person).append("\n");
        }
        return listString.toString();
    }

    public void writeTextToFile(String str) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(getFilePath()))) {
            bw.write(str);
            System.out.println("Запись в файл " + fileName + " произведена успешно.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка. Что-то не так с файлом: " + fileName);
        }
    }

    public String readTextFile() {
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

    public void writeObjectToFile() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(getFilePath()))) {
            oos.writeObject(people);
            System.out.println("Запись в файл " + fileName + " произведена успешно.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка. Что-то не так с файлом.");
        }
    }

    public T[] readBinaryFile() {
        T[] peopleFromFile = null;
        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream(getFilePath()))) {
            peopleFromFile = (T[]) oos.readObject();
            System.out.print("Файл успешно прочитан. Содержимое файла:\n" + Arrays.toString(peopleFromFile) + "\n");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка. Что-то не так с файлом: " + fileName);
        } catch (ClassNotFoundException e) {
            System.out.println("Ошибка. Что-то не так с классом Person");
            ;
        }
        return peopleFromFile;
    }
}
