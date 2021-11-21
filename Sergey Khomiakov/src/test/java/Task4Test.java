import by.itAcademy.homeworks.types.Task4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Task4Test {

    @ParameterizedTest
    @CsvSource(value = {"1,2,5", "1,0,1","-2,-3,1"} )
    void testGetExpression(int a, int b, int z){
        Assertions.assertEquals(z, Task4.getExpression(a,b));
    }
}
