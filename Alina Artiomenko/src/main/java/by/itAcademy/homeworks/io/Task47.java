package by.itAcademy.homeworks.io;
import java.util.List;
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
        WorkWithFileNew task47 = new WorkWithFileNew("Task47.txt");
        String text = "Этот метод записывает в поток вывода один символ char (не int). \n" +
                "Переданное значение приводится к типу char, два первых байта отбрасываются.";

        task47.createNewFile();
        task47.writeToFile(text);
        task47.printTextFromFile(task47.readFile());
        System.out.println("\nКол-во знаков препинания: " + getNumberOfCharacters(task47.readFile()));
        System.out.println("Кол-во слов: " + getNumbOfWord(task47.readFile()));

    }

    public static int getNumberOfCharacters(List<String> list){
        Pattern pattern = Pattern.compile("[.]{3,}|\\?+!+|!+\\?+|!+|\\?+|[.,;:\\-\"]");
        int count = 0;
        for (String text : list){
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()){
                count++;
            }
        }
        return count;
    }

    public static int getNumbOfWord(List<String> list){
        Pattern pattern = Pattern.compile("[А-Яа-яЁёA-Za-z]+");
        int count = 0;
        for (String text : list){
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()){
                count++;
            }
        }
        return count;
    }
}
