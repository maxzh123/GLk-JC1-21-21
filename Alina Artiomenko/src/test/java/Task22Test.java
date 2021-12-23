import org.junit.jupiter.api.Test;
import by.itAcademy.homeworks.arrays.Task22;

import static org.junit.jupiter.api.Assertions.*;

class Task22Test {

    @Test
    void TestflipArray01() {
        int[] array01 = new int[] {6, 9, 6, 9, 6, 7, 2, 7, 2, 7};
        int[] expectArray01 = new int[]{7, 2, 7, 2, 7, 6, 9, 6, 9, 6};
        assertArrayEquals(expectArray01, Task22.flipArray(array01));
    }

    @Test
    void TestflipArray02() {
        int[] array02 = new int[] {1, 1, 1, 2, 2, 3, 3, 4, 4, 4};
        int[] expectArray02 = new int[]{4, 4, 4, 3, 3, 2, 2, 1, 1, 1};

        assertArrayEquals(expectArray02, Task22.flipArray(array02));
    }
}