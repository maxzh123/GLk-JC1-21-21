import by.itAcademy.homeworks.exceptions.Task43;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task43Test {
    @ParameterizedTest
    @CsvSource({",Exception was processed. Попытка получить доступ к методу объекта null",
            "5,Exception wasn't processed"})
    void exception(Object obj,String rez){
        assertEquals(rez, Task43.exception(obj));
    }


}
