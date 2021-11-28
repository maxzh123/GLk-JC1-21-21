package by.itAcademy.homeworks.operators;

//Имеется прямоугольное отверстие размерами a и b, где a и b – целые числа.
//Определить, можно ли его полностью закрыть круглой картонкой радиусом r (тоже целое число).

public class Task7 {
    public static void main(String[] args) {
        int a = (int) (Math.random()*1000);
        int b = (int) (Math.random()*1000);
        int r = (int) (Math.random()*1000);
        if (r * 2 >= Math.sqrt((Math.pow(a, 2)) + (Math.pow(b, 2)))) {
            System.out.println("круглая картонка закроет отверстие");
        } else {
            System.out.println("круглая картонка не закроет отверстие");
        }
    }
}