package by.itAcademy.homeworks.operators;
/*
*
*/


public class Task7 {
    public static void main(String[] args) {
       int a = 6;
       int b = 5;
       int radius = 5;

        System.out.println(check(a,b,radius));

    }
    public static boolean check(int x, int y, int r){
       double hypotenuse = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        return hypotenuse <= r * 2;
    }
}
