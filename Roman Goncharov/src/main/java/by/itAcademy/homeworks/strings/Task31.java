package by.itAcademy.homeworks.strings;

/**
 * Задание 31
 * Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”, один с помощью оператора сложения
 * и String, а другой с помощью StringBuilder и метода append.Сравните скорость их выполнения.
 * Выведите сравнение на экран.
 */

public class Task31 {
    public static void main(String[] args) {
        String abc = "aaabbbccc";
        System.out.println("Скорость выполнения цикла сложения строки "+abc+" 10000 раз(в секундах):");
        System.out.println("С помощью оператора сложения и String: " + concatOfStringsUsingPlus(abc)*0.001);
        System.out.println("С помощью StringBuilder и метода append: " + concatOfStringsUsingStringBuilder(abc)*0.001);
    }

    public static double concatOfStringsUsingPlus(String str){
        String result = "";
        System.gc();
        final double startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            result += str;
        }
        return System.currentTimeMillis() - startTime;
    }

    public static double concatOfStringsUsingStringBuilder(String str){
        StringBuilder result = new StringBuilder();
        System.gc();
        final double startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
           result.append(str);
        }
        return System.currentTimeMillis() - startTime;
    }
}
