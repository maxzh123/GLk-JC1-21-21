package by.itAcademy.homeworks.regexp;

/** Введите с клавиатуры строку. Напишите метод, выполняющий поиск в строке
 * всех тегов абзацев, в том числе тех, у которых есть параметры, например, <p
 * id=”p1”>, и замену их на простые теги абзацев <p>. Результат работы метода
 * выведите на экран.
 */

public class Task30 {
    public static void main(String[] args) {
        String string = SimpleReader.readLine();
        System.out.println(string.replaceAll("<[p].*?>","<p>"));
    }
}
