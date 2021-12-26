import org.junit.jupiter.api.Test;
import by.itAcademy.homeworks.regexp.Task28;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task28Test {

    @ParameterizedTest
    @CsvSource ({"'Вася хороший кот','яйт'",
                 "'Vasya is a good cat','asadt'",
                 "'Вася07 хороший07 кот07','яйт'",})
    void getNewString(String text, String result) {
        assertEquals(result, Task28.getNewString(text));
    }
}