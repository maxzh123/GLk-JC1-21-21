import by.itAcademy.homeworks.regexp.Task26;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Task26Test {

    @ParameterizedTest
    @CsvSource(value = {"'...',1","'???????!!!!!!!!!!',1","'???????',1","'Привет, как дела?',2"})
    void testFindPunctuation(String str, int temp) {
        Assertions.assertEquals(Task26.findPunctuation(str), temp);
    }
}
