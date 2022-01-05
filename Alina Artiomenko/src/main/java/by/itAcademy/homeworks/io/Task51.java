package by.itAcademy.homeworks.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**Задание 51
 * 1. Создать класс Person с полями - name, surname, age
 * 2. Сгенерировать 10 объектров класса Person со случайными полями соответствующего типа
 * 3. Создать файл и записать в него информацию объектов Person
 */
public class Task51 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        final int amountOfPerson = 10;
        String[] name = {"Коля", "Вася", "Даша", "Юля", "Маша",
                          "Павел","Валера", "Вика", "Саша", "Глеб"};
        String[] surname = {"Гагарин", "Грозный", "Петрова", "Жукова", "Жижа",
                             "Хлебушков", "Бобров", "Дятлова", "Владыко", "Яков"};
        int[] age = {10, 20, 15, 69, 26, 19, 4, 9, 49, 18};

        List<Person> listOfPerson = createSomePerson(10,name,surname,age);
        WorkWithFileNew newFile = new WorkWithFileNew("ListOfPerson.txt");
        newFile.createNewFile();
        newFile.writeObjectToFile(listOfPerson);

        try {
//            try (final ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ListOfPerson.txt"))) {
//                for(Person list : listOfPerson){
//                    outputStream.writeObject(list);
//                }
//            }

            try (final ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ListOfPerson.txt"))) {
                for(Person list : listOfPerson){
                    final Person per01 = (Person) inputStream.readObject();
                    System.out.println(per01.toString());
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Mistake");
        }

    }

    public static List<Person> createSomePerson(int amount, String[] name, String[] surname, int[] age){
        List<Person> listOfPerson = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            Person person = new Person(name[i], surname[i],age[i]);
            listOfPerson.add(person);
        }
        return listOfPerson;
    }
}
