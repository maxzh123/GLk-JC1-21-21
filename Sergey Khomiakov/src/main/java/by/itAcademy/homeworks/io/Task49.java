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
        ReadWriteFileAssistant task49 = new ReadWriteFileAssistant("FileForNumbersForTask49.dat");
        task49.writeDataInBinaryFile(20);   //произвели запись чисел в файл
        List<Integer> listOfNumbers = task49.readDataFromBinaryFile();  //произвели чтение из файла

        System.out.println("Список чисел: " + listOfNumbers);
        System.out.println("Среднее арифместическое: " + getAverage(listOfNumbers));

    }

    public static double getAverage(Collection<Integer> collection){
        int sum = 0;
        for(Integer element: collection){
            sum+=element;
        }
        return (double) sum/collection.size();
    }
}
