package by.itAcademy.homeworks.io;

import java.util.List;

public class Task49 {
    public static void main(String[] args) {
        int valueOfArrays = 20;
        WorkingWithAFile file = new WorkingWithAFile("FileForTask49.bin");
        file.writeBinaryFile(arrayOfRandomNumber(valueOfArrays));
        file.readBinaryFile();
        System.out.println(averageOfNumbers(file.getBinaryList()));

    } public static int[] arrayOfRandomNumber (int value){
        int [] arr = new int[value];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 99);
        } return arr;

    } public static double averageOfNumbers (List<Integer> list){
        int sum = 0;
        double result = 0.0;
        for(Integer l:list) {
            sum += l;
            }
        result = (double) sum / list.size();
        System.out.println("Среднее значение : ");
        return result;


    }
}
