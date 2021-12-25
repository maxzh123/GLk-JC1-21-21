import org.junit.jupiter.api.Test;

import static by.itAcademy.homeworks.operators.Task6.foundLast7;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task6Test {
    int a = 100;
    int b = 107;

    @Test
    void divisionBy7F() {
        foundLast7(a);
        assertEquals(false, foundLast7(a));
    }

    @Test
    void divisionBy7T() {
        foundLast7(b);
        assertEquals(true, foundLast7(b));
    }
}