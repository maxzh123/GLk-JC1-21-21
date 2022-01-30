package by.itAcademy.homeworks.dataFormats;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * Задание 74
 * 1) Создать программу, которая будет разбирать xml файл:
 * - выводит его на экран в текстовом виде.
 * - каждая точка должна выводиться на отдельной строке в виде двух чисел, разделенных запятой.
 * - должна выводиться единица измерения. Например: 10px, 30px.
 */

public class Task74 {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(Task74.class.getClassLoader().getResourceAsStream("Point.xml"));
        NodeList pointList = document.getDocumentElement().getElementsByTagName("point");
        for (int i = 0; i < pointList.getLength(); i++) {
            Node nNode = pointList.item(i);
            System.out.println("Текущая точка: " + nNode.getNodeName());
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                System.out.print("x: " + eElement.getElementsByTagName("x").item(0).getTextContent() + "px, ");
                System.out.println("y: " + eElement.getElementsByTagName("y").item(0).getTextContent() + "px.");
            }
        }
    }
}


