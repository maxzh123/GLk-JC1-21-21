package by.itAcademy.homeworks.dataFormats;





import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

/**
 * Задание 75
 * 1) Создать программу, которая будет разбирать xml файл, сделанный в задании 74 с помощью StAX.
 * 2) Вывести его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух чисел,
 * разделенных запятой, при этомдолжна выводиться единица измерения. Например: 10px, 30px.
 */

public class Task75 {
    public static void main(String[] args) throws XMLStreamException {
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLEventReader reader = xmlInputFactory.createXMLEventReader(Task75.class.getClassLoader().getResourceAsStream("Point.xml"));

        while (reader.hasNext()) {
            XMLEvent nextEvent = reader.nextEvent();
            if (nextEvent.isStartElement()) {
                StartElement startElement = nextEvent.asStartElement();
                if (startElement.getName().getLocalPart().equals("x")) {
                    System.out.print("x: " + reader.getElementText() + "px, ");
                }
                if (startElement.getName().getLocalPart().equals("y")) {
                    System.out.println("y: " + reader.getElementText() + "px.");
                }
            }
        }
    }
}