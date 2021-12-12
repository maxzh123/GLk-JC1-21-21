package by.itAcademy.homeworks.strings;

public class Task31 {

static String tmp = "aaabbbccc";

    public static void main(String[] args) {

        System.out.println(compareTheTime(measureTheTimeAdditionAndString(tmp), measureTheTimeStringBuilder(tmp)));


    }

    public static Long measureTheTimeAdditionAndString(String string) {
        long begin = System.nanoTime();
        String str = string;

        for (int i = 0; i < 1000; i++) {
            str += string;
        }
        long end = System.nanoTime();

        return end - begin;


    }

    public static long measureTheTimeStringBuilder(String string) {
        long begin = System.nanoTime();
        StringBuilder sb = new StringBuilder(string);

        for (int i = 0; i < 1000; i++) {
            sb.append(string);

        }
        long end = System.nanoTime();

        return end - begin;
    }

    public static String compareTheTime(long string, long stringbuilder) {
        String text = "";

        System.out.println("Время выполнения с помощью оператора сложения и String = " + string);
        System.out.println("Время выполнения с помощью Stringbuilder и append = " + stringbuilder);

        if (string > stringbuilder) {
            text = "String + оператор сложения дольше чем Stringbuilder и append";
        } else {
            text = "String + оператор сложения быстрее чем Stringbuilder и append";
        }
        return text;
    }
}