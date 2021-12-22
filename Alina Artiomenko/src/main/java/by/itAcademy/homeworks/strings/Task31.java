package by.itAcademy.homeworks.strings;

/**Задание 31
 * 1. Написать два цикла, выполняющий миллион сложений строки вида "aaabbbccc"
 * 2. Певый способ: оператор сложения и String
 * 3. Второсой способ: StringBuilder и метода append
 * 4. Вывод сравнения на экран
 */

public class Task31 {
    public static void main(String[] args){
        String str = "aaabbbccc";

        System.gc();
        System.out.println("Вмеря контекцинация строк: " + resultOfConcat(str));

        System.gc();
        System.out.println("Вмеря append строк: " + resultOfStringBuilder(str));
    }

    static long resultOfConcat(String str){
        String res = "";
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            res += str;
        }
        return System.currentTimeMillis() - startTime;
    }

    static long resultOfStringBuilder(String str){
        StringBuilder res = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            res.append(str);
        }
        return System.currentTimeMillis() - startTime;
    }
}
