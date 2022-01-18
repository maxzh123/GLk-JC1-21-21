package by.itAcademy.homeworks.threads.CallableTask58;

import by.itAcademy.homeworks.io.FileHandler;

import java.io.*;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class MyCallable58 extends FileHandler implements Callable<String> {
    private volatile static int fileCounter;
    private File file;

    public MyCallable58() {
        super("threads" + File.separator + "CallableTask58" + File.separator + "TextFiles" +
                File.separator + "File" + ++fileCounter + ".txt");
    }

    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName() + " начал работу");
        fileWrite(RandomString.getRandomString());
        TimeUnit.SECONDS.sleep((int) (Math.random() * 3 + 1));
        System.out.println(Thread.currentThread().getName() + " закончил работу с файлом " + getFileName());
        return file.getName();
    }

    @Override
    public void fileWrite(String str) {
        file = new File(getFilePath());
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file.getPath()))) {
            bw.write(str);
            System.out.println(Thread.currentThread().getName() + ": Запись в файл " + getFileName() + " произведена успешно.");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + getFileName());
        } catch (IOException e) {
            System.out.println("Ошибка. Что-то не так с файлом: " + getFileName());
        }
    }
}