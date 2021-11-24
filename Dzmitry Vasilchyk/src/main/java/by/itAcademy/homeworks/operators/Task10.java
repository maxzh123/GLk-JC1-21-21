package by.itAcademy.homeworks.operators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**Задание10:
 проверить, поместяться ли два дома на участке, заданных размеров
 **/

public class Task10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размеры домов:");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        System.out.println("Введите размеры участка:");
        int e = Integer.parseInt(reader.readLine());
        int f = Integer.parseInt(reader.readLine());
        compareSquare(a,b,c,d,e,f);
    }
    private static void compareSquare(int a,int b,int c,int d,int e,int f) {
        if(e>=a+c && f>=b && f>=d){
            System.out.println("два дома поместятся на участке");}
            else if(e>=b+d && f>=a && f>=b){
            System.out.println("два дома поместятся на участке");}
            else if(f>=a+c && e>=b && e>=d){
            System.out.println("два дома поместятся на участке");}
            else if(f>=b+d && e>=a && e>=b){
            System.out.println("два дома поместятся на участке");}
            else System.out.println("два дома не поместятся на участке");}
}







