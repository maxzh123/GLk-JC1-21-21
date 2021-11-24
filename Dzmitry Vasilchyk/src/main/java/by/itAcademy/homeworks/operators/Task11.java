package by.itAcademy.homeworks.operators;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**Задание11:
 создать рабочий календарь на неделю
 **/

public class Task11 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите планы на понедельник:");
        String M = reader.readLine();
        System.out.println("Введите планы на вторник:");
        String T = reader.readLine();
        System.out.println("Введите планы на среду:");
        String W = reader.readLine();
        System.out.println("Введите планы на четверг:");
        String Th = reader.readLine();
        System.out.println("Введите планы на пятницу:");
        String F = reader.readLine();
        System.out.println("Введите планы на субботу:");
        String S = reader.readLine();
        System.out.println("Введите планы на воскресенье:");
        String Su = reader.readLine();
        System.out.println("Введите день недели");
        int Day = Integer.parseInt(reader.readLine());
        Deary(M,T,W,Th,F,S,Su,Day);
    }
    private static void Deary(String M,String T,String W,String Th,String F,String S,String Su,int Day) {
        if(Day==1){
            System.out.println("Ваше расписаное на понедельник: " + M);}
        else if(Day==2){
            System.out.println("Ваше расписаное на вторник: " + T);}
        else if(Day==3){
            System.out.println("Ваше расписаное на среду: " + W);}
        else if(Day==4){
            System.out.println("Ваше расписаное на четверг: " + Th);}
        else if(Day==5){
            System.out.println("Ваше расписаное на пятницу: " + F);}
        else if(Day==6){
            System.out.println("Ваше расписаное на субботу: " + S);}
        else if (Day==7){
            System.out.println("Ваше расписаное на воскресенье: " + Su);}
        else System.out.println("Такого дня нет");
    }
}





