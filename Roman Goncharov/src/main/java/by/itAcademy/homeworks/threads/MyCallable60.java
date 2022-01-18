package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.io.FileHandler;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class MyCallable60 extends FileHandler implements Callable<String> {

    public MyCallable60(File file) {
        super(file.getPath());
    }

    @Override
    public String call() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " начал работу");
        fileWrite("Hello World: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss:SSS")));
        TimeUnit.SECONDS.sleep((int) (Math.random() * 3 + 1));
        System.out.println(Thread.currentThread().getName() + " закончил работу");
        return "Задача выполнена";
    }

    @Override
    public synchronized void fileWrite(String str) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(getFileName(), true))) {
            bw.write(str + "\n");
            System.out.println(Thread.currentThread().getName() + ": Запись в файл " + getFileName() + " произведена успешно.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + getFileName());
        } catch (IOException e) {
            System.out.println("Ошибка. Что-то не так с файлом: " + getFileName());
        }
    }
}
