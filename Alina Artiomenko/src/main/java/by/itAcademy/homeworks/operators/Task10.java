package by.itAcademy.homeworks.operators;

import java.sql.SQLOutput;

/**Задание10
 * 1. даны два дома (a на b) и (c на d)
 * 2. дан участок (e на f)
 * 3. проверить, помещаются ли эти дома на участке
 * 4. стороны домов || сторонам участка
 */

public class Task10 {
    public static void main(String[] args) {
        int house01SideA = 10, house01SideB = 60;
        int house02SideA = 10, house02SideB = 15;
        int areaSideA = 20, areaSideB = 50;

        System.out.print(twoHouseArePlate(house01SideA,house01SideB,house02SideA,house02SideB,areaSideA,areaSideB));
    }


        public static String twoHouseArePlate(int house01A, int house01B, int house02A, int house02B,
                                              int areaA, int areaB){
        String result="";
        if ((areaA >= house01A && areaA >= house02A && areaB >= (house01B + house02B)) ||
           (areaA >= house01B && areaA >= house02A && areaB >= (house01A + house02B)) ||
           (areaA >= house01A && areaA >= house02B && areaB >= (house01B + house02A)) ||
           (areaA >= house01B && areaA >= house02B && areaB >= (house01A + house02A)) ||
           (areaB >= house01A && areaB >= house02A && areaA >= (house01B + house02B)) ||
           (areaB >= house01B && areaB >= house02A && areaA >= (house01A + house02B)) ||
           (areaB >= house01A && areaB >= house02B && areaA >= (house01B + house02A)) ||
           (areaB >= house01B && areaB >= house02B && areaA >= (house01A + house02A))){
            return result = "Два дома помещаются на участке";
        } else {
            return result = "Два дома не помещаются на участке";
        }
        }
}