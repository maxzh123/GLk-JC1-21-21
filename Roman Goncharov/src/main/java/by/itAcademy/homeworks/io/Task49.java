package by.itAcademy.homeworks.io;

/**
 * Задание 49
 * Записать с помощью Java в двоичный файл 20 случайных чисел.
 * Прочитать записанный файл, вывести на экран числа и их среднее арифметическое.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task49 {
    private static final List<Integer> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler("io" + File.separator + "File49.dat");
        File newFile = new File(fileHandler.getFilePath());
        binaryFileWrite(newFile);
        readBinaryFile(newFile);
        displayingNumbers();
        System.out.println("\nСреднее арифмитическое чисел файла равно " + arithmeticMeanOfTheNumbers());
    }

    public static void binaryFileWrite(File file) {
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            for (int i = 0; i < 20; i++) {
                dos.writeInt((int) (Math.random() * 20 + 1));
            }
            System.out.println("Запись в файл " + file.getName() + " произведена успешно.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка. Что-то не так с файлом.");
        }
    }

    public static void readBinaryFile(File file) {
        try (DataInputStream dos = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            int number = dos.readInt();
            while (true) {
                arrayList.add(number);
                try {
                    number = dos.readInt();
                } catch (EOFException e) {
                    System.out.println("Файл " + file.getName() + " полностью прочитан.");
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден.");
        } catch (IOException e) {
            System.out.println("Ошибка. Что-то не так с файлом.");
        }
    }

    public static void displayingNumbers() {
        System.out.println("Все прочитанные в файле числа:");
        for (Integer number : arrayList) {
            System.out.print(number + " ");
        }
    }

    public static double arithmeticMeanOfTheNumbers() {
        int sum = 0, count = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
            count++;
        }
        return (double) sum / count;
    }
}
