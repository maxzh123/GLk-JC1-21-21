package by.itAcademy.homeworks.regexp;

/**
 * Задание 30
 * Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке всех тегов абзацев,
 * и замену их на простые теги абзацев <p>. Результат работы метода выведите на экран.
 */

public class Task30 {
    public static void main(String[] args) {
        String str = SimpleInput.getString("Введите строку:");
        System.out.println(replacingTags(str));
    }

    public static String replacingTags(String str) {
        str = str.replaceAll("</p>|<p id=\"p\\d+\">","<p>");
        return str;
    }
}
