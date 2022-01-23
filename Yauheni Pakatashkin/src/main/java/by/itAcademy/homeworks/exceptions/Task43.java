package by.itAcademy.homeworks.exceptions;

public class Task43 {
    public static void main(String[] args) {
        String s=null;
      try {
          System.out.println("Начало работы");
          System.out.println(s.length());   //
      }
      catch (NullPointerException e){
          System.out.println("Произошел проброс исключения");
      }
      finally {
          System.out.println("Продолжение работы при необходимости");
      }
    }

}
