package by.itAcademy.homeworks.types;

/** Задание 04
* Вывести в консоль значения заданных переменных
**/

public class Task3 {
  public static void main(String[] args){
    byte b = 0x55;
    short s = 0x55ff;
    int i = 1000000;
    long l = 0xffffffffL;
    char c = 'a';
    float f = .025f;
    double d = .00001234;
    boolean bool = true;
  
    System.out.println("byte b = " + b);
    System.out.println("short s = " + s);
    System.out.println("int i = " + i);
    System.out.println("long l = " + l);
    System.out.println("char c = " + c);
    System.out.println("float f = " + f);
    System.out.println("double d = " + d);
    System.out.println("boolean bool = " + bool);
  }
}
