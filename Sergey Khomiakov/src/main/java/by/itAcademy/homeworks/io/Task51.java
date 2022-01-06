package by.itAcademy.homeworks.io;

import by.itAcademy.homeworks.io.task51.Human;
import by.itAcademy.homeworks.io.task51.Writer;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/** Задание 51
 *  1) Создать объект Person c полями name, surname, age.
 *  2) Сгенерировать 10 объектов класса Person со случайными полями соответствующего типа.
 *  3) Создать файл, в который запишется информация о этих людях.
 */

public class Task51 {
    public static void main(String[] args) {
        String path = "Sergey Khomiakov/src/main/java/by/itAcademy/homeworks/io/";
        File file = new File(path + "FileForTask51.txt");
        File file1 = new File(path + "FileForObject51.dat");
        Writer.writerOfFiles(file, getListOfPeople(10));    //записываем массив случайных людей в файл
        Writer.writerOfObject(file1, getListOfPeople(10));

    }

    public static List<Human> getListOfPeople(int countOfPeople) {      //получаем массив случайных людей
        ArrayList<Human> peopleList = new ArrayList<>();
        for (int i = 0; i < countOfPeople; i++) {
            peopleList.add(new Human());
        } return peopleList;


    }
}
