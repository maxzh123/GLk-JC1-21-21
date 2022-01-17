package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**Записать с помощью Java в двоичный файл 20 случайных чисел.
 * Прочитать записанный файл, вывести на экран числа и их среднее арифметическое.**/

public class Task49 {
     public static void main(String[] args) throws IOException {
        File file = new File("C://GLk-JC1-21-21//Dzmitry Vasilchyk//src//main//java//by//itAcademy//homeworks//io//fileToTask49");
        writeBinaryFail(file);
        readBinaryFail(file);
    }
    private static void writeBinaryFail(File file) {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file))) {
            for (int i = 0; i < 20; i++) {
                dataOutputStream.writeInt((int) (Math.random() * 10));
            }
        } catch (IOException e) {
            System.out.println("ошибка ввода");
            return;
        }
    }
    private static void readBinaryFail(File file){
        List<Integer> list=new ArrayList<>();
        try(DataInputStream dataInputStream=new DataInputStream(new FileInputStream(file))){
            int number=dataInputStream.readInt();
            while (true){
                list.add(number);
                number=dataInputStream.readInt();
            }
        }
        catch (IOException e){
            System.out.println();
        }
        System.out.println("список чисел: "+list);
        System.out.println("среднее арифметическое: "+everageNumber(list));
    }
    private static double everageNumber(Collection<Integer> string) {
        int s = 0;
        for (Integer x : string) {
            s+=x;
        }
        return (double) s/string.size();
    }
}




