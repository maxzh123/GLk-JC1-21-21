import static org.junit.jupiter.api.Assertions.*;
import by.itAcademy.homeworks.arrays.Task23;
import org.junit.jupiter.api.Test;

class Task23Test {

    @Test
    void fillingButterflyArrayTest01(){
        int[][] expectArray = new int[][]{ {1, 1, 1, 1},{0, 1, 1, 0}, {0, 1, 1, 0}, {1, 1, 1, 1} };
        int[][] resultArray = Task23.fillingButterflyArray(4);

        assertArrayEquals(expectArray,resultArray);
    }

    @Test
    void fillingButterflyArrayTest02(){
        int[][] expectArray = new int[][]{ {1, 1, 1, 1, 1, 1, 1},
                                           {0, 1, 1, 1, 1, 1, 0},
                                           {0, 0, 1, 1, 1, 0, 0},
                                           {0, 0, 0, 1, 0, 0, 0},
                                           {0, 0, 1, 1, 1, 0, 0},
                                           {0, 1, 1, 1, 1, 1, 0},
                                           {1, 1, 1, 1, 1, 1, 1} };
        int[][] resultArray = Task23.fillingButterflyArray(7);

        assertArrayEquals(expectArray,resultArray);
    }
}