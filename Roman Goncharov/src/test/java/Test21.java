import by.itAcademy.homeworks.arrays.Task21;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.converter.TypedArgumentConverter;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test21 {
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


    @ParameterizedTest
    @CsvSource(value = {
            "2,1;2;3",
            "2,3;2;1",
            "3,3;2;1;1",
            "3,1;1;2;3",
            "3,3;1;1;2;3",
            "5,3;2;2;1;1;2;3",
            "12,3;2;2;1;1;2;1;1;3;1;3;3"
    })
    public void testArrayLength(int sum,@ConvertWith(IntArrayConverter.class)  Object[] data ){
        int[] arr=new int[data.length];
        for(int i=0;i<data.length;i++){arr[i]=(int)data[i];};
        Assertions.assertEquals(sum, Task21.calcSum(arr));
    }

}
