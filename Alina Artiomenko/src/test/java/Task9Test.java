import by.itAcademy.homeworks.operators.Task9;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {
    //Task9 task9Test = new Task9();

    @ParameterizedTest
    @CsvSource({"28, 02, 2021, false, 'Завтра: 01.03.2021'","31, 12, 1998, false,'Завтра: 01.01.1999'", "28, 02, 1964, true, 'Завтра: 29.02.1964'"})
    void nextDate(int day, int month, int year, boolean leapYear, String result) {
        assertEquals(result, Task9.nextDate(day, month, year, leapYear));
    }
}