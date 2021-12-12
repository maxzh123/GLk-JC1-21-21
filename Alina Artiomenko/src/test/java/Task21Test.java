import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import by.itAcademy.homeworks.arrays.Task21;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.TypedArgumentConverter;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class Task21Test {
    public static class IntArrayConverter extends TypedArgumentConverter<String,Object[]> {
        public IntArrayConverter() {
            super(String.class,Object[].class);
        }

        @Override
        protected Object[] convert(String source) throws ArgumentConversionException {
            String[] arr=((String) source).split("\\s*;\\s*");
            return Arrays.stream(arr).map(i->Integer.valueOf(i)).collect(Collectors.toList()).toArray();
        }
    }

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

    @ParameterizedTest
    @CsvSource(value = {
            "6,1;2;3",
            "6,3;2;1",
            "7,3;2;1;1",
            "7,1;1;2;3",
            "7,3;1;1;2;3",
            "9,3;2;2;1;1;2;3",
            "17,3;2;2;1;1;2;1;1;3;1;3;3"
    })
    public void testArrayLength(int sum,@ConvertWith(IntArrayConverter.class)  Object[] data ){
        int[] arr=new int[data.length];
        for(int i=0;i<data.length;i++){arr[i]=(int)data[i];};
        Assertions.assertEquals(sum, Task21.calcSum(arr));
    }

}