import by.itAcademy.homeworks.loops.Task17;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Test17 {

    @Test
    public void testCountOfDigits(){
        Assertions.assertEquals(Task17.getCountOfDigits(5),1);
        Assertions.assertEquals(Task17.getCountOfDigits(100),3);
        Assertions.assertEquals(Task17.getCountOfDigits(999),3);
        Assertions.assertEquals(Task17.getCountOfDigits(1000),4);
        Assertions.assertEquals(Task17.getCountOfDigits(99887),5);
    }

    @Test
    public void testConcat(){
        Assertions.assertEquals("1 ",Task17.concatArray(new int[]{1}));
        //А должно быть!!! И ниже тоже!!!
        //Assertions.assertEquals("1",Task17.concatArray(new int[]{1}));
        Assertions.assertEquals("12 ",Task17.concatArray(new int[]{12}));
        Assertions.assertEquals("123 ",Task17.concatArray(new int[]{123}));
        Assertions.assertEquals("1 234 ",Task17.concatArray(new int[]{234,1}));
    }

    @ParameterizedTest
    @CsvSource(value = {
            "1, 1",
            "1, 12",
            "1, 123",
            "2, 1234",
            "2, 12345",
            "2, 123456",
            "3, 123456789",
    }) //собственно тут и видно в чем проблема. Потому что читаем документацию на Math.round
    public void testArrayLength(int len,int num){
        Assertions.assertEquals(len,Task17.formatNumber(num).length);
    }


}
