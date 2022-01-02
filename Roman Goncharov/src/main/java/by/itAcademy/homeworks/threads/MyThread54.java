package by.itAcademy.homeworks.threads;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class MyThread54 implements Runnable {
    Thread myThread;

    public MyThread54() {
        myThread = new Thread(this);
    }

    @Override
    public void run() {
        int[] arrayForThread = Task53.creationAndFillingTheArray(10);
        fileWrite(Arrays.toString(arrayForThread));
    }

    public void fileWrite(String str) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(Task54.file, true))) {
            bw.write(str);
            bw.newLine();
            System.out.println(myThread.getName() + ": Запись в файл " + Task54.file.getName() + " произведена успешно.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + Task54.file.getName());
        } catch (IOException e) {
            System.out.println("Ошибка. Что-то не так с файлом: " + Task54.file.getName());
        }
    }
}
