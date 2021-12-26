import by.itAcademy.homeworks.regexp.Task28;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class Task28Test {

    @ParameterizedTest
    @CsvSource(value = {"Всем привет,мт","На улице хорошая погода,аеяа","Это карт-бланш,ош"})
    void testFindTheLastLetters(String str, String lastChars) {
        Assertions.assertEquals(Task28.findTheLastLetters(str), lastChars);
    }
}
