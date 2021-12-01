package by.itAcademy.homeworks.operators;

import by.itAcademy.homeworks.arrays.FillingTheArray;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) throws Exception {
        int [] sides = FillingTheArray.array(6);
        out(namesOfSides, sides);
        compareOfPlots(sides);
    }

    private static void compareOfPlots(int [] array ){
        int [] sides = FillingTheArray.array(6);
        if(Math.max(array[4],array[5])>=Math.max(array[0],array[1])&&
                Math.max(array[4],array[5])>=Math.max(array[2],array[3])&&
                Math.min(array[4],array[5])>=Math.min(array[0],array[1])+Math.min(array[2],array[3])){
            System.out.println("Дома помещаются на участке");
        }
        else System.out.println("Дома не помещаются на участке");

    }
    private static final char [] namesOfSides = {'a', 'b', 'c', 'd', 'e', 'f'};
    private static void out(char[]a, int []b){
        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]+" = "+b[i]);
        }
    }

}
