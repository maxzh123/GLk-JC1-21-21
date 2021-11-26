package by.itAcademy.homeworks.operators;
/*
> Имеются два дома размерами a на b и c на d. Имеется участок размерами e на
> f. Проверить, помещаются ли эти дома на данном участке. Стороны домов –
> параллельны сторонам участка, в остальном размещение может быть любым.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task10 {
    static int a, b, c, d, e, f;
    public static void main(String[] args) {
        try{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a");
        a = Integer.parseInt(reader.readLine());
        System.out.println("Enter b");
        b = Integer.parseInt(reader.readLine());
        System.out.println("Enter c");
        c = Integer.parseInt(reader.readLine());
        System.out.println("Enter d");
        d = Integer.parseInt(reader.readLine());
        System.out.println("Enter e");
        e = Integer.parseInt(reader.readLine());
        System.out.println("Enter f");
        f = Integer.parseInt(reader.readLine());}
        catch (Exception ex){
            ex.printStackTrace();
            System.out.println("You need to use whole number");
        }
        if (a > 0 && b > 0 && c > 0 && d > 0 && e > 0 && f > 0){
                 if(Math.max(e,f)>=Math.max(Math.max(a, b), Math.max(c,d)) && Math.min(e,f)>=Math.max(Math.min(a,b),Math.min(c,d))){
                        if (e*f>=a*b+c*d){
                                 System.out.println("Two houses are placed on area");
                        }
                        else{System.out.println("Two houses are not placed on area");
                        }
                }else{System.out.println("Two houses are not placed on area");
                }
        }else {
            System.out.println("You entered negative numbers");
        }

    }

}

