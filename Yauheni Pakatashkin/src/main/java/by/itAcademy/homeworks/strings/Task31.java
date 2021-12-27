package by.itAcademy.homeworks.strings;

public class Task31 {
    public static void main(String[] args) {
        String s = "aaabbbccc";
        System.out.println(stringSeconds(s));
        System.out.println(strinBuilderSeconds(s));
    }

    public static long stringSeconds(String a){
        String s1 = "";
        System.gc();
        long time = System.currentTimeMillis();
        for (int i = 0; i<100000; i++){
            s1+=a;
        }
        long time1 = System.currentTimeMillis();
        return time1-time;
    }

    public static long strinBuilderSeconds(String a){
        StringBuilder str = new StringBuilder();
        System.gc();
        long time = System.currentTimeMillis();
        for (int i = 0; i<100000; i++){
            str.append(a);
        }
        long time1 = System.currentTimeMillis();
        return time1-time;
    }
}
