import by.itAcademy.homeworks.regexp.Task27;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Task27Test {

    @ParameterizedTest
    @CsvSource(value = {"'Я живу в Беларуси',4","'Карт-бланш',1","'Меня зо  вут Рома',3"})
    void testFindWords(String str, int temp) {
        Assertions.assertEquals(Task27.findWords(str), temp);
    }
}
