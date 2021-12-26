package by.itAcademy.homeworks.io;

/**
 * Задание 49
 * Записать с помощью Java в двоичный файл 20 случайных чисел.
 * Прочитать записанный файл, вывести на экран числа и их среднее арифметическое.
 */

import java.io.*;

public class Task49 {
    public static void main(String[] args) {
        File newFile = new File(".//Roman Goncharov//src//main//java//by//itAcademy//homeworks//io//File49.dat");
        fileWrite(newFile);
        readFile(newFile);
    }

    public static void fileWrite(File file){
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            for (int i = 0; i < 20; i++) {
                dos.writeInt((int)(Math.random()*20+1));
            }
            System.out.println("Запись в файл произведена успешно.");
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден.");
        } catch (IOException e){
            System.out.println("Ошибка. Что-то не так с файлом.");
        }
    }

    public static void readFile(File file){
        try (DataInputStream dos = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            int number = dos.readInt(), count = 0, sum = 0;
            System.out.println("Все прочитанные в файле числа:");
            while(true){
                System.out.print(number + " ");
                sum += number;
                count++;
                try{
                    number = dos.readInt();
                } catch (EOFException e){
                    System.out.println("\nСреднее арифмитическое чисел равно "+(double)sum/count);
                    System.out.println("Файл полностью прочитан.");
                    break;
                }
            }
        } catch (FileNotFoundException e){
            System.out.println("Файл не найден.");
        } catch (IOException e){
            System.out.println("Ошибка. Что-то не так с файлом.");
        }
    }
}
