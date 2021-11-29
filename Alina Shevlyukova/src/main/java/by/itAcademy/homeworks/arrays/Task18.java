package by.itAcademy.homeworks.arrays;

public class Task18 {
    public static void main(String[] args){
        int[] xArray = new int[10];

        for (int i = 0; i < 10; i++){
            xArray[i] = (int) (10 * Math.random());
        }
        System.out.println(xArray[9]);
    }
}
