
import by.itAcademy.homeworks.loops.Task14;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Task14Test {
    Task14 task14 = new Task14();
    @ParameterizedTest
    @CsvSource(value = {"12456, 18", "7893823445, 53", "70000086300,24"})
    void testGetTheSumOfUnits(long number, int sum){
        Assertions.assertEquals(task14.getTheSumOfUnits(number),sum);
    }

}

