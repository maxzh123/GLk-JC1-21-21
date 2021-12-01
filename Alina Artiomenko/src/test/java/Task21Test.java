import org.junit.jupiter.api.Test;
import by.itAcademy.homeworks.arrays.Task21;
import static org.junit.jupiter.api.Assertions.*;

class Task21Test {
    int[] arr = new int[] {10, 15, 15, 25, 3, 4, 3, 0, 13, 59};

    @Test
    void getMaxNumberOfArray() {
        int indexMax = 9;
        int resultMax = Task21.getMaxNumberOfArray(arr);
        assertEquals(indexMax,resultMax);
    }

    @Test
    void getMinNumberOfArray() {
        int indexMin = 7;
        int resultMin = Task21.getMinNumberOfArray(arr);
        assertEquals(indexMin, resultMin);
    }

    @Test
    void getSumBetweenMaxMin() {
        int summ = 72;
        int resultSumm = Task21.getSumBetweenMaxMin(arr,
                Task21.getMaxNumberOfArray(arr),Task21.getMinNumberOfArray(arr));
        assertEquals(summ,resultSumm);
    }

}