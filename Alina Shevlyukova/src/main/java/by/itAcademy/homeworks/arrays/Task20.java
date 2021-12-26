package by.itAcademy.homeworks.arrays;

public class Task20 {
    public static void main(String[] args) {
        int[] xArray = {2, 9, 13, 79, 9, 45, 67, 43, 31, 75};
        int indexOfMaxValue = 0;
        int maxValue = xArray[indexOfMaxValue];
        for (int i = 0; i < 10; i++) {
            if (xArray[i] > maxValue) {
                maxValue = xArray[i];
                indexOfMaxValue = i;
            }
        }System.out.println("Maximum value is " + maxValue + ". Index is " + indexOfMaxValue);
    }
}
