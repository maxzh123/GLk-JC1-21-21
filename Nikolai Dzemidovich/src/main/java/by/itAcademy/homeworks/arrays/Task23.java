package by.itAcademy.homeworks.arrays;

public class Task23 {
    public static void main(String[] args) {

        int[][] array = new int[5][5];

        for (int i = 0; i < array.length / 2; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (j < i || j >= (array.length - i)) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }

            System.out.println();

        }
        for (int i = array.length / 2; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (j > i || j < (array.length -1 - i)) {
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }


    }
}