package by.itAcademy.homeworks.objects;

public class Task25 {
    public static void main(String[] args) {
//        Test123.init();
//        new Test123();
//        new Test123();
//        new Test123();
//        new Test123();
        StringBuffer sb=new StringBuffer();
        sb.append("1");
        sb.append("23");
        String s=sb.toString();
        System.out.println("123");
        System.out.println(s==s.intern());

    }
}
