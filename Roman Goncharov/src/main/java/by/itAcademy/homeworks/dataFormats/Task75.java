package by.itAcademy.homeworks.dataFormats;

/**
 * Задание 75
 * Напишите программу, которая будет разбирать xml файл: File74.xml c помощью StAX, и выводить его на экран в
 * текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел, разделенных запятой,
 * при этом должна выводиться единица измерения. Например: 10px, 30px.
 */

import by.itAcademy.homeworks.io.FileHandler;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Task75 {
    private static final List<Integer> points = new ArrayList<>();

    public static void main(String[] args) {
        FileHandler fh = new FileHandler("dataFormats" + File.separator + "File74.xml");
        File file = new File(fh.getFilePath());
        try {
            fileParsing(file);
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < points.size(); i += 2) {
            Point point = new Point(points.get(i), points.get(i + 1));
            System.out.println(point);
        }
    }

    public static void fileParsing(File file) throws FileNotFoundException, XMLStreamException {
        XMLInputFactory factory = XMLInputFactory.newFactory();
        XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream(file));
        boolean isX = false;
        boolean isY = false;
        boolean isPoint = false;
        while (reader.hasNext()) {
            int res = reader.next();
            if (res == reader.START_ELEMENT) {
                if (reader.getLocalName().equals("point")) { // Нашли открывающий тег point
                    isPoint = true;
                } else if (reader.getLocalName().equals("x") && isPoint) { // Нашли тег x point
                    isX = true;
                } else if (reader.getLocalName().equals("y") && isPoint) { // Нашли тег y point
                    isY = true;
                    isPoint = false;
                }
            }
            if (res == reader.CHARACTERS) {
                if (isX) {
                    points.add(Integer.valueOf(reader.getText()));
                    isX = false;
                } else if (isY) {
                    points.add(Integer.valueOf(reader.getText()));
                    isY = false;
                }
            }
        }
        reader.close();
    }
}