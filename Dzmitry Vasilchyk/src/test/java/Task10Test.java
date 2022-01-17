import by.itAcademy.homeworks.operators.Task10;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task10Test {
    @ParameterizedTest
    @CsvSource({"20, 70, 25, 50, 100, 150, два дома поместятся на участке",
            "10, 60, 10, 15, 20, 50, два дома не поместятся на участке",
            "25, 150, 25, 150, 50, 150, два дома поместятся на участке",
            "50, 75, 50, 75, 50, 150, два дома не поместятся на участке",
            "1, 3, 2, 3, 2, 5, два дома не поместятся на участке"})
    void compareSquare(int a, int b, int c, int d, int e, int f,String result){
        assertEquals(result, Task10.compareSquare(a,b,c,d,e,f));
    }

}
