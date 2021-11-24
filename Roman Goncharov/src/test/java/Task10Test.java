import by.itAcademy.homeworks.types.Task4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Task10Test {

    @ParameterizedTest
    @CsvSource(value = {"2,4,14"} )
    void testGetExpression(int a, int b, int c){
        Assertions.assertEquals(c, Task4.getExpression(a,b));
    }
}
