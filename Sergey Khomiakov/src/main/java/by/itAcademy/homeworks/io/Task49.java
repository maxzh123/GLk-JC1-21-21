package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/** Задание 49
 *  1) Записать с помощью Java в двоичный файл 20 случайных чисел.
 *  2) Прочитать записанный файл.
 *  3) Вывести на экран числа и их среднее арифметическое.
 */

public class Task49 {
    public static void main(String[] args) {
        File path = new File("Sergey Khomiakov/src/main/java/by/itAcademy/homeworks/io/FileForNumbersForTask49.dat");
        binaryWriterForNumbers(path);
        readerForNumber(path);
    }

    public static void binaryWriterForNumbers(File path){
        try (DataOutputStream  dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(path)))){
            for(int i = 0; i < 20;i++){
                dataOutputStream.writeInt((int)(Math.random()*100));
            } System.out.println("Файл записан.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void readerForNumber(File path)  {
        List<Integer> arrayList = new ArrayList<>();
        try(DataInputStream reader = new DataInputStream(new BufferedInputStream(new FileInputStream(path)))){
            int number = reader.readInt();
            while (true){
                arrayList.add(number);
                try{
                    number = reader.readInt();}
                catch (EOFException e) {
                    break;
                }
            }
            System.out.println("Список чисел: " + arrayList);
            System.out.println("Среднее арифметическое: " + getAverage(arrayList));
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static double getAverage(Collection<Integer> collection){
        int sum = 0;
        for(Integer element: collection){
            sum+=element;
        }
        return (double) sum/collection.size();
    }
}
