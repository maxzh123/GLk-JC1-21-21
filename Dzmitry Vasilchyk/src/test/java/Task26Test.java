import by.itAcademy.homeworks.regexp.Task26;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task26Test {
    @ParameterizedTest
    @CsvSource({"4,'Приложения, Java обычно. транслируются в? специальный байт-код'",
            "3,'Изначально язык назывался Oak («Дуб»), разрабатывался Джеймсом Гослингом для'"})
    void exception(int count,String s){
        assertEquals(count, Task26.string(s));
    }
}


