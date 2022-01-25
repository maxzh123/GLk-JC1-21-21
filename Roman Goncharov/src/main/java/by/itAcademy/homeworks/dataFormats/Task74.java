package by.itAcademy.homeworks.dataFormats;

/**
 * Задание 74
 * Напишите программу, которая будет разбирать xml файл: File74.xml
 * и выводить его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел,
 * разделенных запятой, при этом должна выводиться единица измерения. Например: 10px, 30px.
 */

import by.itAcademy.homeworks.io.FileHandler;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task74 {
    private static final List<Integer> points = new ArrayList<>();

    public static void main(String[] args) {
        FileHandler fh = new FileHandler("dataFormats" + File.separator + "File74.xml");
        File file = new File(fh.getFilePath());
        try {
            fileParsing(file);
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < points.size(); i += 2) {
            Point point = new Point(points.get(i), points.get(i + 1));
            System.out.println(point);
        }
    }

    public static void fileParsing(File file) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(file);
        Element root = doc.getDocumentElement();
        System.out.println(root.getTagName() + ": ");
        NodeList nList = root.getChildNodes();
        for (int i = 0; i < nList.getLength(); i++) {
            if (nList.item(i) instanceof Element) {
                NodeList list = nList.item(i).getChildNodes();
                for (int j = 0; j < list.getLength(); j++) {
                    if (list.item(j) instanceof Element) {
                        points.add(Integer.valueOf(list.item(j).getTextContent()));
                    }
                }
            }
        }
    }
}
