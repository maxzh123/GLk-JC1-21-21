package by.itAcademy.homeworks.strings;

public class Task31 {
    static String line="aaabbbccc";


    public static void main(String[] args) {
        System.gc();
        System.out.println("Время с помощью Stringbuilder " + getStringBuilder(line));
        System.out.println("Время без помощи Stringbuilder " + withoutStringBuilder(line));
    }

    public static long getStringBuilder(String string){
        long begin = System.nanoTime();
        StringBuilder SB=new StringBuilder();
        for (int i=0; i<100000; i++){
            SB.append(string);
            String result=SB.toString();
        }long end = System.nanoTime();
        return end-begin;
    }

    public static long withoutStringBuilder(String string){
        long begin = System.nanoTime();
        String str=string;
        for (int i=0; i<100000; i++){
            str+=string;
        }long end = System.nanoTime();
        return end-begin;

    }
}
