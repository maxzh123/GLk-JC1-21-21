package by.itAcademy.homeworks.operators;

import java.util.Scanner;
  //при условии, что a||c||e
  //Имеются два дома размерами a на b и c на d.Имеется участок размерами e на f. Проверить,помещаются ли эти дома на данном участке. Стороны домов – параллельны сторонам участка,в остальном размещение может быть любым.
public class Task10 {
      public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          System.out.println("a=");
          int a = input.nextInt();
          System.out.println("b=");
          int b = input.nextInt();
          System.out.println("c=");
          int c = input.nextInt();
          System.out.println("d=");
          int d = input.nextInt();
          System.out.println("e=");
          int e = input.nextInt();
          System.out.println("f=");
          int f = input.nextInt();

          int s1 = a * b;
          int s2 = c * d;
          int s3 = e * f;

          if (s1 + s2 <= s3) {
              if (Math.max(e, f) >= Math.max(Math.max(a, b), Math.max(c, d)) && Math.min(e, f) >= Math.max(Math.min(a, b), Math.min(c, d))) {
                  if ((e >= a + c) & (f >= b + d)) {
                      System.out.println("Размещение возможно");
                  } else {
                      System.out.println("Приобретите участок побольше.");
                  }
              } else {
                  System.out.println("Приобретите участток побольше.");
              }
          } else {
              System.out.println("Приобретите участток побольше.");
          }
      }
  }

