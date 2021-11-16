package by.itAcademy.homeworks.types;
//Написать код, который выведет значения переменных на экран:
public class Task3 {
     public static void main(String[] args) {
       
        byte b = 0x55;
        short s = 0x55ff;
        int i = 1000000;
        long l = 0xffffffffL;
        char c = 'a';
        float f = .25f;
        double d = .00001234;
        boolean bool = true;
       
        System.out.println("byte = " + b);
        System.out.println("short = " + s);
        System.out.println("int = " + i);
        System.out.println("long = " + l);
        System.out.println("char = " + c);
        System.out.println("float = " + f);
        System.out.println("double = " + d);
        System.out.println("boolean = " + bool);
    }
}
