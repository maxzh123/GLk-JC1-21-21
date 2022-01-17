import by.itAcademy.homeworks.exceptions.Task43;
import by.itAcademy.homeworks.regexp.Task27;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task27Test {
    @ParameterizedTest
    @CsvSource({"8,'Приложения Java обычно транслируются в специальный байт-код'",
            "9,'Изначально язык назывался Oak («Дуб»), разрабатывался Джеймсом Гослингом для'"})
    void exception(int count,String s){
        assertEquals(count, Task27.string(s));
    }
}
