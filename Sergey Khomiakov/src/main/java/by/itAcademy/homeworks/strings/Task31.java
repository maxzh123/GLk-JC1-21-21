package by.itAcademy.homeworks.strings;

/**Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”,
 * один с помощью оператора сложения и String, а другой с помощью StringBuilder и
 * метода append. Сравните скорость их выполнения. Выведите сравнение на экран.
  */

public class Task31 {
    static String line = "aaabbbccc";

    public static void main(String[] args) {
        System.gc();
        System.out.println(getSimpleConcatTest(line));

        System.gc();
        System.out.println(getSimpleStringBuilderTest(line));
    }

    public static long getSimpleConcatTest(String string){
        String result = "";
        long start=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            result+=string;
         }
        return System.currentTimeMillis()-start;
    }

    public static long getSimpleStringBuilderTest(String string){
        StringBuilder result = new StringBuilder();
        long start=System.currentTimeMillis();
        for (int i = 0; i < 100000; i++){
            result.append(string);
        }
        return System.currentTimeMillis()-start;
    }

}
