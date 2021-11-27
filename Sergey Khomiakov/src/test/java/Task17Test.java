import by.itAcademy.homeworks.loops.Task17;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class Task17Test {
    Task17 task17 = new Task17();
    @ParameterizedTest
    @CsvSource({"-17099008,'-17 099 008'", "0, '0'", "20023143, '20 023 143'", "45, '45'"})
    void testGetNewFormatString(int num, String result){
        Assertions.assertEquals(task17.getNewFormatString(num),result);
    }
}
