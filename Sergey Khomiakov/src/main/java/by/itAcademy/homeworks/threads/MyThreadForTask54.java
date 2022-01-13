package by.itAcademy.homeworks.threads;

import by.itAcademy.homeworks.io.ReadWriteFileAssistant;

import java.io.File;

/** Задание 54
 * 1) Создать класс поток, который создает средствами
 * 2) Поток должен создавать средствами Java файл и записать в него произвольно сгенерированный массив из 10 случайных
 * целых чисел.
 * 3) Запустить 5 потоков.
 */

public class MyThreadForTask54 extends ReadWriteFileAssistant implements Runnable {
    private final String  path = "Sergey Khomiakov" + File.separator + "src" + File.separator + "main" + File.separator +
            "java" + File.separator + "by" + File.separator + "itAcademy" + File.separator + "homeworks" +
            File.separator + "threads" + File.separator + "task54" + File.separator;
    private Thread th;

    public MyThreadForTask54(String nameOfFile) {
        super(nameOfFile);
        th = new Thread(this);
    }

    @Override
    public String getFullPath() {
        return path + getNameOfFile();
    }

    @Override
    public void run() {
        writeDataInBinaryFile(10);
        System.out.println(Thread.currentThread().getName());
    }

    public void start() {
        th.start();
    }
}
