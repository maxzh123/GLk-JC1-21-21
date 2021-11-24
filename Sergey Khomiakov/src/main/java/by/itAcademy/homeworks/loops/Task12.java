package by.itAcademy.homeworks.loops;
/*
Вычислить факториал целых чисел от 0 до 10 с помощью цикла while
 */

public class Task12 {

    public int getFactorialFrom0to10(){
        int factorial = 1;
        int count = 10;

        while (count > 0){
            factorial*=count;
            count--;
        }
        return factorial;
    }
}
