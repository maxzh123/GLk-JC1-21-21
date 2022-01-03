package by.itAcademy.homeworks.strings;

/**Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”,
 *  один с помощью оператора сложения и String, а другой с помощью StringBuilder
 *  и метода append. Сравните скорость их выполнения. Выведите сравнение на экран **/

public class Task31 {
    public static void main (String[] args){
        String a="a";
        String b="b";
        long start = System.currentTimeMillis();
        for (int i=0;i<=1000000;i++){
            String string = a+b;
        }
        System.out.println("string+ cost time: " + (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append(a);
        }
        String string = stringBuilder.toString();
        System.out.println("stringbuilder cost time: " + (System.currentTimeMillis() - start) + "ms");
    }

}

