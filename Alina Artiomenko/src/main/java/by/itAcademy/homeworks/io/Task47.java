package by.itAcademy.homeworks.io;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**Задание 47
 * 1. Создать файл с текстом
 * 2. Прочитать его
 * 3. Посчитать в тексте кол-во знаков препинания
 * 4. Посчитать в тексте кол-во слов
 * 5. Вывести результат на экран
 */

public class Task47 {
    public static void main(String[] args) {
        WorkWithFile task47 = new WorkWithFile("Task47.txt");

        String text = "Этот метод записывает в поток вывода один символ char (не int). Переданное значение приводится к типу char, " +
                "два первых байта отбрасываются.";

        task47.creatFileAndAddText(task47.getPath(),text);
        String textFromFile = task47.readFile(task47.getPath());
        System.out.println(textFromFile);
        System.out.println("Кол-во знаков препинания: " + getNumberOfCharacters(textFromFile));
        System.out.println("Кол-во слов: " + getNumberOfWords(textFromFile));

    }

    public static int getNumberOfCharacters(String text){
        Pattern pattern = Pattern.compile("[\\p{Punct}]");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }

    public static int getNumberOfWords(String text){
        Pattern pattern = Pattern.compile("[А-Яа-яЁёA-Za-z]+");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()){
            count++;
        }
        return count;
    }
}
