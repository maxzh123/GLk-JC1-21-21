

import by.itAcademy.homeworks.loops.Task12;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task12Test {
    @Test
    void testFactorialFrom0to10() {
        Task12 task12 = new Task12();
        Assertions.assertEquals(3628800, task12.getFactorialFrom0to10());
    }
}