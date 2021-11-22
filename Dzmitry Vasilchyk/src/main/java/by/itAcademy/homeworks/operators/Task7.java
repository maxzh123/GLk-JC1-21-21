package by.itAcademy.homeworks.operators;


import java.util.Scanner;

/**Задание07:
 проверить, можно ли кругом с радиусом r, закрыть прямоугольное оверстие, заданных размеров
 **/

public class Task7 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("Введите длину отверстия:");
        int length = a.nextInt();

        Scanner b = new Scanner(System.in);
        System.out.println("Введите ширину отверстия:");
        int width = b.nextInt();

        Scanner r = new Scanner(System.in);
        System.out.println("Введите радиус круга:");
        int radius = r.nextInt();

        if (Math.sqrt((length*length)+(width*width))<=2*radius)
        System.out.println("можно");
        else System.out.println("нельзя");
    }
}
