package by.itAcademy.homeworks.arrays;

/** Создайте переменную для массива из 10 элементов. Заполните его
*произвольными значениями целочисленного типа. Определите сумму элементов
*массива, расположенных между минимальным и максимальным значениями. Если
*значений максимальных и минимальных несколько, то необходимо взять
*максимальное значение разницы индексов между максимальным и минимальным
*значениями. */

public class Task21 {
    static int countsOfElements = 10;
    static boolean[] maxValues = new boolean[countsOfElements];
    static boolean[] minValues = new boolean[countsOfElements];

    public static void main(String[] args) {

        int[] myFourthArray = Task18.getHelperToCreateArray(countsOfElements);

        int maxIndex = getMaximumIndexInArray(myFourthArray);
        int minIndex = getMinimumIndexInArray(myFourthArray);

        int maximumValue = myFourthArray[maxIndex];
        int minimumValue = myFourthArray[minIndex];

        maxValues = getBooleanArray(myFourthArray, maximumValue);
        minValues = getBooleanArray(myFourthArray, minimumValue);

        int start = maxIndex;
        int stop = minIndex;

        for(int i = 0; i<maxValues.length;i++){
            for(int j = 0; j< minValues.length;j++){
                if(maxValues[i] && minValues[j]){
                    if(Math.abs(start - stop)< Math.abs(i-j)){
                        start = i;
                        stop = j;
                    }
                }
            }
        }

        if (start > stop) {
            int tmp = start;
            start = stop;
            stop = tmp;

        }

        System.out.println(getSumBetweenMaxAndMin(myFourthArray, start, stop));

    }

    public static int getSumBetweenMaxAndMin(int[] array, int start, int stop){
        int sum = 0;
        for (int i = start + 1; i < stop;i++){
            sum+=array[i];
        }
        return sum;
    }

    public static int getMaximumIndexInArray(int [] array){

        int maxValue = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                index = i;

            }
        } return index;
    }

    public static int getMinimumIndexInArray(int [] array){

        int minValue = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= minValue) {
                minValue = array[i];
                index = i;
            }
        } return index;

    }

    public static boolean[] getBooleanArray(int[] array, int valueMaxOrMin){
        boolean[] helperForBoolean = new boolean[array.length];
        for (int i = 0; i< array.length;i++){
            if(i==valueMaxOrMin){
                helperForBoolean[i] = true;
            }
        } return helperForBoolean;
    }
}




