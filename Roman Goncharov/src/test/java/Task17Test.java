import by.itAcademy.homeworks.loops.Task17;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Task17Test {

    @ParameterizedTest
    @CsvSource(value = {"15792840,15 792 840","1321456123,1 321 456 123","1000, 1 000"})
    void testSumNumbers(int num, String result) {
        Assertions.assertEquals(Task17.newFormat(num), result);
    }
}
