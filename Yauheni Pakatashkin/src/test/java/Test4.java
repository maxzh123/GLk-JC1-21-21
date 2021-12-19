import by.itAcademy.homeworks.types.Task4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Task4Test {

    @ParameterizedTest
    @CsvSource(value = {"1,2,5", "1,0,1","-2,-3,1"} )
    void testOperation(int a, int b, int result){
        Assertions.assertEquals(result, Task4.operation(a,b));
    }
}