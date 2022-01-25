package by.itAcademy.homeworks.strings;

/**
 * Задание 31
 *
 * Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”.
 * 1 с помощью оператора сложения и String.
 * 2 с помощью StringBuilder и метода append.
 * Сравните скорость их выполнения.
 * Выведите сравнение на экран.
 *
 */

public class Task31 {

    static String text = "aaabbbccc";

    public static void main(String[] args) {
        System.out.println(speedComparison(additionOperator(text), additionUsingStringBuilder(text)));
    }

    public static Long additionOperator (String text){
        String string = text;
        System.gc();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            string += text;
        }
        return System.nanoTime() - startTime;
    }

    public static Long additionUsingStringBuilder (String text){
        StringBuilder str = new StringBuilder(text);
        System.gc();
        long startTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            str.append(text);
        }
        return System.nanoTime() - startTime;
    }

    public static String speedComparison (long string, long stringBuilder){
        String text = "";
        System.out.println("Скорость выполнения с помощью оператора сложения и String = " + string + ".");
        System.out.println("Скорость выполнения с помощью StringBuilder и append = " + stringBuilder + ".");
        if (string > stringBuilder) {
            text = "String + оператор сложения медленнее,чем StringBuilder и append.";
        } else {
            text = "String + оператор сложения быстрее,чем StringBuilder и append.";
        }
        return text;
    }
}
