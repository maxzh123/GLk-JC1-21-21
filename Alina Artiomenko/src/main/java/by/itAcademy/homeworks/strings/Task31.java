package by.itAcademy.homeworks.strings;

/**Задание 31
 * 1. Написать два цикла, выполняющий миллион сложений строки вида "aaabbbccc"
 * 2. Певый способ: оператор сложения и String
 * 3. Второсой способ: StringBuilder и метода append
 * 4. Вывод сравнения на экран
 */

public class Task31 {
    public static void main(String[] args){
        String text = "aaabbbccc";
        final int repit = 1_000_000;

        System.out.println("Время работы StringBuilder: " + StringBuilderTest(text,repit) + " ms");
        System.out.println("Время работы String: " + StringTest(text,repit) + " ms");

    }

    static long StringTest(String str, int rep){
        String result = "";
        String text = str;
        System.gc();
        long start=System.currentTimeMillis();

        for (int i = 0; i < rep; i++){
                result +=str;
        }
        return System.currentTimeMillis() - start;
    }

    static long StringBuilderTest(String str, int rep){
        StringBuilder result = new StringBuilder();
        String text = str;
        System.gc();
        long start=System.currentTimeMillis();

        for (int i = 0; i < rep; i++){
            result.append(text);
        }
        return System.currentTimeMillis() - start;
    }
}
