package by.itAcademy.homeworks.operators;

/**Задание 07
 * 1. Задать размер прямоугольника a на b, тип int
 * 2. Задать радиус окружности r, тип int
 * 3. Перекроет ли окружность с заданным радиусом прямоугольник с заданными параметрами
 * 4. Вернуть результат
 */

import java.io.*;

public class Task7 {

    public static void main(String[] args){
        BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));

        try{
            System.out.print("Введите длину прямоугольника а: ");
            int a = Integer.parseInt(inputNum.readLine());

            System.out.print("Введите высоту прямоугольника b: ");
            int b = Integer.parseInt(inputNum.readLine());

            System.out.print("Введите радиус окружности r: ");
            int r = Integer.parseInt(inputNum.readLine());

            System.out.print(cirScribedCircle(r, diagonal(a,b)));
         } catch (Exception ex){
            System.out.print("Данные введени неверно!");
        }

    }

    public static double diagonal(int rectangleLength, int rectangleWidth){
        double rectangleDig = Math.sqrt(Math.pow(rectangleLength,2) + Math.pow(rectangleWidth,2));
        return rectangleDig;
    }

    public static String cirScribedCircle(int radius, double diagonal){
        if (radius >= diagonal/2) {
            return "Окружность перекрывает прямоугольник";
        } else {
            return "Окружность НЕ перекрывает прямоугольник";
        }
    }
}
