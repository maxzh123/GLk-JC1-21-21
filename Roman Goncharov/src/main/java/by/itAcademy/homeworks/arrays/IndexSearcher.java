package by.itAcademy.homeworks.arrays;

public class IndexSearcher {
    private static int indexMin, indexMax;
    private static int firstMin, lastMin, firstMax, lastMax;

    public static int getIndexMin(int[] array){
        indexAssignment(array);
        return indexMin;
    }

    public static int getIndexMax(int[] array){
        indexAssignment(array);
        return indexMax;
    }

    private static void indexAssignment(int[] array){
        firstIndexMaxElement(array);
        lastIndexMaxElement(array);
        firstIndexMinElement(array);
        lastIndexMinElement(array);
        theMostDistantIndices();
    }

    private static void theMostDistantIndices(){
        int distanceOne = Math.abs(firstMax - firstMin);
        int distanceTwo = Math.abs(firstMax - lastMin);
        int distanceThree = Math.abs(lastMax - firstMin);
        int distanceFour = Math.abs(lastMax - lastMin);
        if (distanceOne>=distanceTwo && distanceOne>=distanceThree && distanceOne>=distanceFour){
            indexMin = firstMin; indexMax = firstMax;
        } else if (distanceTwo>=distanceOne && distanceTwo>=distanceThree && distanceTwo>=distanceFour){
            indexMin = lastMin; indexMax = firstMax;
        } else if (distanceThree>=distanceOne && distanceThree>=distanceTwo && distanceThree>=distanceFour){
            indexMin = firstMin; indexMax = lastMax;
        } else if (distanceFour>=distanceOne && distanceFour>=distanceTwo && distanceFour>=distanceThree){
            indexMin = lastMin; indexMax = lastMax;
        }
    }

    private static void firstIndexMaxElement(int[] array) {
        int indexMax = 0;
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        firstMax = indexMax;
    }

    private static void lastIndexMaxElement(int[] array) {
        int indexMax = array.length-1;
        int max = array[array.length-1];
        for (int i = array.length-2; i >= 0; i--) {
            if (array[i] > max) {
                max = array[i];
                indexMax = i;
            }
        }
        lastMax = indexMax;
    }

    private static void firstIndexMinElement(int[] array) {
        int indexMin = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        firstMin = indexMin;
    }

    private static void lastIndexMinElement(int[] array) {
        int indexMin = array.length-1;
        int min = array[array.length-1];
        for (int i = array.length-2; i >= 0; i--) {
            if (array[i] < min) {
                min = array[i];
                indexMin = i;
            }
        }
        lastMin = indexMin;
    }
}