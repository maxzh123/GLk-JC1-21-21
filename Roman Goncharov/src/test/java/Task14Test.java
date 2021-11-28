import by.itAcademy.homeworks.loops.Task14;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Task14Test {

    @ParameterizedTest
    @CsvSource(value = {"123,6","456,15","100,1"})
    void testSumNumbers(long num, long sum) {
        Assertions.assertEquals(Task14.sumNumbers(num), sum);
    }
}
