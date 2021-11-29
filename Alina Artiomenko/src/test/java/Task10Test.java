import by.itAcademy.homeworks.operators.Task10;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Task10Test {

    @ParameterizedTest
    @CsvSource({
            "20, 70, 25, 50, 100, 150, 'Два дома помещаются на участке'",
            "10, 60, 10, 15, 20, 50, 'Два дома не помещаются на участке'",
            "25, 150, 25, 150, 50, 150, 'Два дома помещаются на участке'",
            "50, 75, 50, 75, 50, 150, 'Два дома помещаются на участке'",
            "1, 3, 2, 3, 2, 5, 'Два дома не помещаются на участке'"})
    void twoHouseArePlate(int house01A, int house01B, int house02A, int house02B,
                          int areaA, int areaB, String result) {
        assertEquals(result,Task10.twoHouseArePlate(house01A,house01B,house02A,house02B,areaA,areaB));
    }
}