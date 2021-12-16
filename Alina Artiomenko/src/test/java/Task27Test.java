import org.junit.jupiter.api.Test;
import by.itAcademy.homeworks.regexp.Task27;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task27Test {

    @ParameterizedTest
    @CsvSource ({"'  Любой    символ, кроме буквенного или цифрового символа или знака подчёркивания  ', 10",
                 "'Hello Andrey!', 2",
                 "'На улице мороз-5 +10  ', 3",
                 "'  Мне не нравятся 012546 регулярные выражения 123  ', 5"})
    void getNumberOfWords(String text, int result) {
        assertEquals(result, Task27.getNumberOfWords(text));
    }
}