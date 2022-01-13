package by.itAcademy.homeworks.strings;

/** Задание 31
 * Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”, один с помощью оператора
 * сложения и String, а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения.
 * Выведите сравнение на экран.
 */

public class Task31 {

    static String type = "aaabbbccc";

    public static void main(String[] args) {
        System.out.println(compareSpeed(measurementSpeedStringAndAddition(type), measurementSpeedStringBuilder(type)));
    }

    public static Long measurementSpeedStringAndAddition(String string) {
        long start = System.currentTimeMillis();
        String str = string;
        for (int i = 0; i < 100000; i++) {
            str += string;
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static Long measurementSpeedStringBuilder(String string) {
        long start = System.currentTimeMillis();
        StringBuilder tmp = new StringBuilder(string);
        for (int i = 0; i < 100000; i++) {
            tmp.append(string);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static String compareSpeed(long string, long stringbuilder) {
        String text = "";
        System.out.println("Скорость выполнения с помощью оператора сложения и String = " + string);
        System.out.println("Скорость выполнения с помощью Stringbuilder и append = " + stringbuilder);
        if (string > stringbuilder) {
            text = "String + оператор сложения медленнее,чем Stringbuilder и append";
        } else {
            text = "String + оператор сложения быстрее,чем Stringbuilder и append";
    }
        return text;
}
}
