import by.itAcademy.homeworks.loops.Task13;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class Task13Test {
    @Test
    void testFactorialFrom0to25() {
        Task13 task13 = new Task13();
        BigInteger number = new BigInteger("15511210043330985984000000");
        Assertions.assertEquals(number, task13.getFactorialFrom0to25());

    }
}

